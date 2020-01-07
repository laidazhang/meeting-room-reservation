package app.reservation.api.meetingroom;

import core.framework.api.json.Property;

import java.util.List;

/**
 * @author kimi
 */
public class SearchMeetingRoomResponse {
    @Property(name = "total")
    public Integer total;

    @Property(name = "meeting_rooms")
    public List<MeetingRoomView> meetingRooms;
}
