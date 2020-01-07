package app.reservation;

import app.reservation.api.BOCompanyWebService;
import app.reservation.api.CompanyWebService;
import app.reservation.company.domin.Company;
import app.reservation.company.service.CompanyService;
import app.reservation.company.web.BOCompanyWebServiceImpl;
import app.reservation.company.web.CompanyWebServiceImpl;
import core.framework.module.DBConfig;
import core.framework.module.Module;

/**
 * @author kimi
 */
public class CompanyModule extends Module {
    @Override
    protected void initialize() {
        DBConfig db = db();
        db.repository(Company.class);

        bind(CompanyService.class);

        api().service(CompanyWebService.class, bind(CompanyWebServiceImpl.class));
        api().service(BOCompanyWebService.class, bind(BOCompanyWebServiceImpl.class));
    }
}
