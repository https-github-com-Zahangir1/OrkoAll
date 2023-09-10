package ourTeam.doctorProfile;

import authorised_Access.splashScreen.SplashScreen;
import base.BaseClass;
import org.testng.annotations.Test;
import orkoCare.ourTeam.doctorProfilePage.DoctorProfilePage;

public class DoctorProfile extends BaseClass {

    @Test
    public void our_teamTest() throws InterruptedException {
        //Login
        Thread.sleep(2000);
        SplashScreen lg = new SplashScreen(driver);
        lg.login_homepage();

        //Our Team => Doctor Profile
        DoctorProfilePage dp = new DoctorProfilePage(driver);
        dp.click_on_ourTeam().click();
        Thread.sleep(4000);
    }

}
