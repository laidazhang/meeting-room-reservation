package app.reservation.company.domin;

import core.framework.api.validate.Length;
import core.framework.api.validate.NotBlank;
import core.framework.api.validate.NotNull;
import core.framework.db.Column;
import core.framework.db.PrimaryKey;
import core.framework.db.Table;

import java.time.ZonedDateTime;

/**
 * @author kimi
 */
@Table(name = "companies")
public class Company {
    @Column(name = "id")
    @PrimaryKey(autoIncrement = true)
    public Integer id;

    @NotNull
    @NotBlank
    @Length(max = 50)
    @Column(name = "company_name")
    public String companyName;

    @NotNull
    @NotBlank
    @Length(max = 200)
    @Column(name = "description")
    public String description;

    @NotNull
    @NotBlank
    @Length(max = 100)
    @Column(name = "address")
    public String address;

    @NotNull
    @Column(name = "status")
    public CompanyStatus status;

    @NotNull
    @Column(name = "created_time")
    public ZonedDateTime createdTime;

    @Column(name = "updated_time")
    public ZonedDateTime updatedTime;
}
