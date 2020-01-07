package app.reservation.api;

import app.reservation.api.meetingroom.SearchMeetingRoomRequest;
import app.reservation.api.meetingroom.SearchMeetingRoomResponse;
import core.framework.api.web.service.GET;
import core.framework.api.web.service.Path;

/**
 * @author kimi
 */
public interface MeetingRoomWebService {
    @Path("/meeting-room")
    @GET
    SearchMeetingRoomResponse search(SearchMeetingRoomRequest request);
}
