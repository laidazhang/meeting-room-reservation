package app.reservation.api;

import app.reservation.api.company.BOCreateCompanyRequest;
import app.reservation.api.company.BOCreateCompanyResponse;
import app.reservation.api.company.BOSearchCompanyRequest;
import app.reservation.api.company.BOSearchCompanyResponse;
import core.framework.api.http.HTTPStatus;
import core.framework.api.web.service.DELETE;
import core.framework.api.web.service.GET;
import core.framework.api.web.service.POST;
import core.framework.api.web.service.Path;
import core.framework.api.web.service.PathParam;
import core.framework.api.web.service.ResponseStatus;

/**
 * @author kimi
 */
public interface BOCompanyWebService {
    @Path("/bo/company")
    @POST
    @ResponseStatus(HTTPStatus.CREATED)
    BOCreateCompanyResponse create(BOCreateCompanyRequest request);

    @Path("/bo/company")
    @GET
    BOSearchCompanyResponse search(BOSearchCompanyRequest request);

    @Path("/bo/company/:id")
    @DELETE
    void delete(@PathParam("id") Integer id);
}
