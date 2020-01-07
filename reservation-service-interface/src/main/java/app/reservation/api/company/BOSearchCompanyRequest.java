package app.reservation.api.company;

import core.framework.api.validate.Max;
import core.framework.api.validate.Min;
import core.framework.api.validate.NotNull;
import core.framework.api.web.service.QueryParam;

/**
 * @author kimi
 */
public class BOSearchCompanyRequest {
    @NotNull
    @QueryParam(name = "skip")
    public Integer skip = 0;

    @NotNull
    @Min(1)
    @Max(100)
    @QueryParam(name = "limit")
    public Integer limit = 10;

    @QueryParam(name = "status")
    public String status;

    @QueryParam(name = "company_name")
    public String companyName;
}
