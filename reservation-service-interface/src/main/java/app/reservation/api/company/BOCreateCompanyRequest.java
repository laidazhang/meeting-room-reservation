package app.reservation.api.company;

import core.framework.api.json.Property;
import core.framework.api.validate.Length;
import core.framework.api.validate.NotBlank;
import core.framework.api.validate.NotNull;

/**
 * @author kimi
 */
public class BOCreateCompanyRequest {
    @NotNull
    @NotBlank
    @Length(max = 50)
    @Property(name = "company_name")
    public String companyName;

    @NotNull
    @NotBlank
    @Length(max = 200)
    @Property(name = "description")
    public String description;

    @NotNull
    @NotBlank
    @Length(max = 100)
    @Property(name = "address")
    public String address;
}
