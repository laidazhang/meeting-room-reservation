package app.reservation.api.meetingroom;

import core.framework.api.json.Property;
import core.framework.api.validate.Length;
import core.framework.api.validate.NotBlank;
import core.framework.api.validate.NotNull;

/**
 * @author kimi
 */
public class BOCreateMeetingRoomRequest {
    @NotNull
    @NotBlank
    @Length(max = 50)
    @Property(name = "room_name")
    public String roomName;

    @NotNull
    @NotBlank
    @Length(max = 200)
    @Property(name = "description")
    public String description;
}
