package appointment.profile;

import authorised_Access.splashScreen.SplashScreen;
import base.BaseClass;
import org.testng.annotations.Test;
import patientProfile.profilePage.Prescription_Page;

public class Prescription extends BaseClass {


    @Test
    public void prescriptionTest() throws InterruptedException {
        //Login
        Thread.sleep(2000);
        SplashScreen lg = new SplashScreen(driver);
        lg.login_homepage();

        //Patient uploaded prescription
        Prescription_Page _prescription = new Prescription_Page(driver);
        _prescription.click_on_pt_profile().click();
        Thread.sleep(2000);
        _prescription.click_on_parent().click();
        Thread.sleep(2000);
        _prescription.click_on_prescription().click();
        Thread.sleep(2000);
        _prescription.click_on_report().click();
        Thread.sleep(2000);
        _prescription.click_on_invoice().click();
        Thread.sleep(2000);
        _prescription.click_on_image().click();
        Thread.sleep(5000);


    }

}
