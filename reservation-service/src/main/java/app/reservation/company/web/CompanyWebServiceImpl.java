package app.reservation.company.web;

import app.reservation.api.CompanyWebService;
import app.reservation.api.company.SearchCompanyRequest;
import app.reservation.api.company.SearchCompanyResponse;
import app.reservation.company.service.CompanyService;
import core.framework.inject.Inject;

/**
 * @author kimi
 */
public class CompanyWebServiceImpl implements CompanyWebService {
    @Inject
    CompanyService companyService;

    @Override
    public SearchCompanyResponse search(SearchCompanyRequest request) {
        return companyService.search(request);
    }
}
