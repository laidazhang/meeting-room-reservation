package app.reservation.api.reservation;

import core.framework.api.json.Property;
import core.framework.api.validate.Max;
import core.framework.api.validate.Min;
import core.framework.api.validate.NotNull;
import core.framework.api.web.service.QueryParam;

/**
 * @author kimi
 */
public class SearchReservationRequest {
    @NotNull
    @QueryParam(name = "skip")
    public Integer skip = 0;

    @NotNull
    @Min(1)
    @Max(100)
    @QueryParam(name = "limit")
    public Integer limit = 10;

    @Property(name = "meeting_room_id")
    public Integer meetingRoomId;
}
