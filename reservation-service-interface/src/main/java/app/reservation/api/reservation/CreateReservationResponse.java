package app.reservation.api.reservation;

import app.reservation.api.meetingroom.MeetingRoomView;
import core.framework.api.json.Property;

import java.time.ZonedDateTime;

/**
 * @author kimi
 */
public class CreateReservationResponse {
    @Property(name = "id")
    public Integer id;

    @Property(name = "status")
    public String status;

    @Property(name = "begin_time")
    public ZonedDateTime beginTime;

    @Property(name = "end_time")
    public ZonedDateTime endTime;

    @Property(name = "meeting_room")
    public MeetingRoomView meetingRoom;

    @Property(name = "created_time")
    public ZonedDateTime createdTime;
}
