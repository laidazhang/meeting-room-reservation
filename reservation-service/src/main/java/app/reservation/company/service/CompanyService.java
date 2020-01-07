package app.reservation.company.service;

import app.reservation.api.company.CompanyView;
import app.reservation.api.company.SearchCompanyRequest;
import app.reservation.api.company.SearchCompanyResponse;
import app.reservation.company.domin.Company;
import app.reservation.company.domin.CompanyStatus;
import core.framework.db.Query;
import core.framework.db.Repository;
import core.framework.inject.Inject;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author kimi
 */
public class CompanyService {
    @Inject
    Repository<Company> companyRepository;

    public SearchCompanyResponse search(SearchCompanyRequest request) {
        Query<Company> query = companyRepository.select();
        query.skip(request.skip);
        query.limit(request.limit);
        query.where("status", CompanyStatus.ACTIVE);
        List<CompanyView> companies = query.fetch().stream().map(this::view).collect(Collectors.toList());
        SearchCompanyResponse response = new SearchCompanyResponse();
        response.companies = companies;
        response.total = query.count();
        return response;
    }

    public CompanyView view(Company entity) {
        CompanyView companyView = new CompanyView();
        companyView.id = entity.id;
        companyView.companyName = entity.companyName;
        companyView.description = entity.description;
        companyView.address = entity.address;
        return companyView;
    }
}
