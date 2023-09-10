package appointment;

import base.BaseClass;
import org.testng.annotations.Test;
import orkoCare.appointmentPage.AppointmentPage;
import authorised_Access.splashScreen.SplashScreen;

public class Appointment extends BaseClass {

    @Test
    public void appointmentTest() throws InterruptedException {
        //Login
        Thread.sleep(2000);
        SplashScreen lg = new SplashScreen(driver);
        lg.login_homepage();

        //Appointment
        AppointmentPage ap = new AppointmentPage(driver);
        ap.click_on_appointment().click();
        Thread.sleep(1000);
        ap.click_on_select_patient().click();
        Thread.sleep(1000);
        ap.click_on_center_location().click();
        Thread.sleep(1000);
        ap.click_on_continueBtn().click();
        Thread.sleep(3000);
        ap.click_on_ap_slot().click();
        Thread.sleep(3000);
        ap.click_on_nextBtn().click();
        Thread.sleep(1000);
        ap.click_on_confirm_ap().click();
        Thread.sleep(5000);
        System.out.println("You have booked an appointment successfully!");


    }

}
