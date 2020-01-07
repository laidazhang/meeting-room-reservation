package app.reservation.api;

import app.reservation.api.meetingroom.BOCreateMeetingRoomRequest;
import app.reservation.api.meetingroom.BOCreateMeetingRoomResponse;
import app.reservation.api.meetingroom.BOSearchMeetingRoomRequest;
import app.reservation.api.meetingroom.BOSearchMeetingRoomResponse;
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
public interface BOMeetingRoomWebService {
    @Path("/bo/meeting-room")
    @POST
    @ResponseStatus(HTTPStatus.CREATED)
    BOCreateMeetingRoomResponse create(BOCreateMeetingRoomRequest request);

    @Path("/bo/meeting-room")
    @GET
    BOSearchMeetingRoomResponse search(BOSearchMeetingRoomRequest request);

    @Path("/bo/meeting-room/:id")
    @DELETE
    void delete(@PathParam("id") Integer id);
}
