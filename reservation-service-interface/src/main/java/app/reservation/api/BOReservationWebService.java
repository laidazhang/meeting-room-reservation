package app.reservation.api;

import app.reservation.api.reservation.BOSearchReservationRequest;
import app.reservation.api.reservation.BOSearchReservationResponse;
import core.framework.api.web.service.GET;
import core.framework.api.web.service.Path;

/**
 * @author kimi
 */
public interface BOReservationWebService {
    @Path("/bo/reservation")
    @GET
    BOSearchReservationResponse search(BOSearchReservationRequest request);
}
