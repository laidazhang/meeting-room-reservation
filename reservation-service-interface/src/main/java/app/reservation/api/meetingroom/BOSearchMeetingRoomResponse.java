package app.reservation.api.meetingroom;

import app.reservation.api.company.CompanyView;
import core.framework.api.json.Property;

import java.util.List;

/**
 * @author kimi
 */
public class BOSearchMeetingRoomResponse {
    @Property(name = "total")
    public Integer total;

    @Property(name = "meeting_rooms")
    public List<MeetingRoomView> meetingRooms;
}
