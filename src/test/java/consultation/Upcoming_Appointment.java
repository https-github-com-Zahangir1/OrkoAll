package consultation;

import authorised_Access.splashScreen.SplashScreen;
import base.BaseClass;
import org.testng.annotations.Test;

public class Upcoming_Appointment extends BaseClass {

    @Test
    public void upcoming_appointment_test() throws InterruptedException {
        //Login
        Thread.sleep(2000);
        SplashScreen lg = new SplashScreen(driver);
        lg.login_homepage();

        //Upcoming Appointment
        Upcoming_Appointment_Page _uap = new Upcoming_Appointment_Page(driver);
        _uap.click_on_consultation().click();
        Thread.sleep(2000);
        _uap.click_on_upcoming_appointment().click();
        Thread.sleep(2000);
        _uap.click_on_patient_parent().click();
        Thread.sleep(3000);


    }
}
