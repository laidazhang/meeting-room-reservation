package app.reservation.api;

import app.reservation.api.reservation.CreateReservationRequest;
import app.reservation.api.reservation.CreateReservationResponse;
import app.reservation.api.reservation.SearchReservationRequest;
import app.reservation.api.reservation.SearchReservationResponse;
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
public interface ReservationWebService {
    @Path("/reservation")
    @POST
    @ResponseStatus(HTTPStatus.CREATED)
    CreateReservationResponse create(CreateReservationRequest request);

    @Path("/reservation")
    @GET
    SearchReservationResponse search(SearchReservationRequest request);

    @Path("/reservation/:userId/:id")
    @DELETE
    void delete(@PathParam("userId") Integer userId, @PathParam("id") Integer id);
}
