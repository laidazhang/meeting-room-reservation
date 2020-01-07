package app.reservation.api.meetingroom;

import core.framework.api.json.Property;

import java.time.ZonedDateTime;

/**
 * @author kimi
 */
public class MeetingRoomView {
    @Property(name = "id")
    public Integer id;

    @Property(name = "room_name")
    public String roomName;

    @Property(name = "description")
    public String description;

    @Property(name = "status")
    public String status;

    @Property(name = "company_id")
    public Integer companyId;

    @Property(name = "company_name")
    public String companyName;

    @Property(name = "created_time")
    public ZonedDateTime createdTime;

    @Property(name = "updated_time")
    public ZonedDateTime updatedTime;
}
