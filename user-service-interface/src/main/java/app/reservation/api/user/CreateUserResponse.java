package app.reservation.api.user;

import core.framework.api.json.Property;

import java.time.ZonedDateTime;

/**
 * @author kimi
 */
public class CreateUserResponse {
    @Property(name = "id")
    public Integer id;

    @Property(name = "user_name")
    public String userName;

    @Property(name = "company_id")
    public Integer companyId;

    @Property(name = "company_name")
    public String companyName;

    @Property(name = "status")
    public String status;

    @Property(name = "created_time")
    public ZonedDateTime createdTime;
}
