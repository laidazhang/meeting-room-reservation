package app.reservation.company.domin;

import core.framework.db.DBEnumValue;

/**
 * @author kimi
 */
public enum CompanyStatus {
    @DBEnumValue("ACTIVE")
    ACTIVE,
    @DBEnumValue("INACTIVE")
    INACTIVE
}
