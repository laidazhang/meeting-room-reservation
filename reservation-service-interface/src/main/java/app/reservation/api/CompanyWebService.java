package app.reservation.api;

import app.reservation.api.company.SearchCompanyRequest;
import app.reservation.api.company.SearchCompanyResponse;
import core.framework.api.web.service.GET;
import core.framework.api.web.service.Path;

/**
 * @author kimi
 */
public interface CompanyWebService {
    @Path("/company")
    @GET
    SearchCompanyResponse search(SearchCompanyRequest request);
}
