package app.reservation.api.reservation;

import core.framework.api.json.Property;
import core.framework.api.validate.NotNull;

import java.time.ZonedDateTime;

/**
 * @author kimi
 */
public class CreateReservationRequest {
    @NotNull
    @Property(name = "user_id")
    public Integer userId;

    @NotNull
    @Property(name = "meeting_room_id")
    public Integer meetingRoomId;

    @NotNull
    @Property(name = "begin_time")
    public ZonedDateTime beginTime;

    @NotNull
    @Property(name = "end_time")
    public ZonedDateTime endTime;
}
