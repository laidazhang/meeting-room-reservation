package app.reservation.api.reservation;

import core.framework.api.json.Property;

import java.util.List;

/**
 * @author kimi
 */
public class SearchReservationResponse {
    @Property(name = "total")
    public Integer total;

    @Property(name = "reservations")
    public List<ReservationView> reservations;
}
