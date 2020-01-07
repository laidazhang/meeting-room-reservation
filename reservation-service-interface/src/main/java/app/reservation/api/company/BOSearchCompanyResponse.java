package app.reservation.api.company;

import core.framework.api.json.Property;

import java.util.List;

/**
 * @author kimi
 */
public class BOSearchCompanyResponse {
    @Property(name = "total")
    public Integer total;

    @Property(name = "companies")
    public List<CompanyView> companies;
}
