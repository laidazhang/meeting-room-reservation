package app.reservation;

import core.framework.module.App;
import core.framework.module.SystemModule;

/**
 * @author kimi
 */
public class ReservationServiceApp extends App {
    @Override
    protected void initialize() {
        load(new SystemModule("sys.properties"));
        load(new CompanyModule());
        load(new MeetingRoomModule());
        load(new ReservationModule());
    }
}
