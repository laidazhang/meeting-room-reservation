package app.reservation.api.user;

import core.framework.api.json.Property;
import core.framework.api.validate.Length;
import core.framework.api.validate.NotBlank;
import core.framework.api.validate.NotNull;

/**
 * @author kimi
 */
public class CreateUserRequest {
    @NotNull
    @NotBlank
    @Length(min = 6, max = 50)
    @Property(name = "user_name")
    public String userName;

    @NotNull
    @Property(name = "company_id")
    public Integer companyId;
}
