package app.reservation.company.service;

import app.reservation.api.company.BOCreateCompanyRequest;
import app.reservation.api.company.BOCreateCompanyResponse;
import app.reservation.api.company.BOSearchCompanyRequest;
import app.reservation.api.company.BOSearchCompanyResponse;
import app.reservation.api.company.CompanyView;
import app.reservation.company.domin.Company;
import app.reservation.company.domin.CompanyStatus;
import core.framework.db.Query;
import core.framework.db.Repository;
import core.framework.inject.Inject;
import core.framework.util.Strings;
import core.framework.web.exception.ConflictException;
import core.framework.web.exception.NotFoundException;

import java.time.ZonedDateTime;
import java.util.List;
import java.util.Optional;
import java.util.OptionalLong;
import java.util.stream.Collectors;

/**
 * @author kimi
 */
public class BOCompanyService {
    @Inject
    Repository<Company> companyRepository;

    public BOCreateCompanyResponse create(BOCreateCompanyRequest request) {
        Optional<Company> existCompany = companyRepository.selectOne("company_name = ?", request.companyName);
        if (existCompany.isPresent()) {
            throw new ConflictException("company already exists, companyName=" + request.companyName);
        }
        Company company = new Company();
        company.companyName = request.companyName;
        company.description = request.description;
        company.address = request.address;
        company.status = CompanyStatus.ACTIVE;
        company.createdTime = ZonedDateTime.now();
        OptionalLong id = companyRepository.insert(company);
        return createResponse(id.getAsLong(), company);
    }

    public BOSearchCompanyResponse search(BOSearchCompanyRequest request) {
        Query<Company> query = companyRepository.select();
        query.skip(request.skip);
        query.limit(request.limit);
        if (!Strings.isBlank(request.status)) {
            query.where("status = ?", request.status);
        }
        if (!Strings.isBlank(request.companyName)) {
            query.where("company_name like ?", Strings.format("{}%", request.companyName));
        }
        List<CompanyView> companies = query.fetch().stream().map(this::view).collect(Collectors.toList());
        BOSearchCompanyResponse response = new BOSearchCompanyResponse();
        response.companies = companies;
        response.total = query.count();
        return response;
    }

    public BOCreateCompanyResponse createResponse(Long id, Company entity) {
        BOCreateCompanyResponse response = new BOCreateCompanyResponse();
        response.id = id.intValue();
        response.companyName = entity.companyName;
        response.description = entity.description;
        response.address = entity.address;
        response.status = entity.status.name();
        response.createdTime = entity.createdTime;
        return response;
    }

    public CompanyView view(Company entity) {
        CompanyView companyView = new CompanyView();
        companyView.id = entity.id;
        companyView.companyName = entity.companyName;
        companyView.description = entity.description;
        companyView.address = entity.address;
        companyView.status = entity.status.name();
        companyView.createdTime = entity.createdTime;
        companyView.updatedTime = entity.updatedTime;
        return companyView;
    }

    public void delete(Integer id) {
        Company existCompany = companyRepository.get(id).orElseThrow(() -> new NotFoundException("company not found"));
        companyRepository.delete(existCompany.id);
    }
}
