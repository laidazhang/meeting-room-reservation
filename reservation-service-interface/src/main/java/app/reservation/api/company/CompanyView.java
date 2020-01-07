package app.reservation.api.company;

import core.framework.api.json.Property;

import java.time.ZonedDateTime;

/**
 * @author kimi
 */
public class CompanyView {
    @Property(name = "id")
    public Integer id;

    @Property(name = "company_name")
    public String companyName;

    @Property(name = "description")
    public String description;

    @Property(name = "address")
    public String address;

    @Property(name = "status")
    public String status;

    @Property(name = "created_time")
    public ZonedDateTime createdTime;

    @Property(name = "updated_time")
    public ZonedDateTime updatedTime;
}
