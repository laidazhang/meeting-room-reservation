package app.reservation.company.web;

import app.reservation.api.BOCompanyWebService;
import app.reservation.api.company.BOCreateCompanyRequest;
import app.reservation.api.company.BOCreateCompanyResponse;
import app.reservation.api.company.BOSearchCompanyRequest;
import app.reservation.api.company.BOSearchCompanyResponse;
import app.reservation.company.service.BOCompanyService;
import core.framework.inject.Inject;

/**
 * @author kimi
 */
public class BOCompanyWebServiceImpl implements BOCompanyWebService {
    @Inject
    BOCompanyService companyService;

    @Override
    public BOCreateCompanyResponse create(BOCreateCompanyRequest request) {
        return companyService.create(request);
    }

    @Override
    public BOSearchCompanyResponse search(BOSearchCompanyRequest request) {
        return companyService.search(request);
    }

    @Override
    public void delete(Integer id) {
        companyService.delete(id);
    }
}
