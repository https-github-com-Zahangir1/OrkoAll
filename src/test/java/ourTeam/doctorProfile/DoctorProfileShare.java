package orkoCare.ourTeam.doctorProfile;

import authorised_Access.splashScreen.SplashScreen;
import base.BaseClass;
import org.testng.annotations.Test;
import orkoCare.ourTeam.doctorProfilePage.DoctorProfilePage;
import orkoCare.ourTeam.doctorProfilePage.DoctorProfileSharePage;

public class DoctorProfileShare extends BaseClass {

    @Test
    public void doctorProfileShareTest() throws InterruptedException {
        //Login
        Thread.sleep(2000);
        SplashScreen lg = new SplashScreen(driver);
        lg.login_homepage();

        //Our Team => Doctor Profile
        DoctorProfilePage dp = new DoctorProfilePage(driver);
        dp.click_on_ourTeam().click();
        Thread.sleep(4000);

        //Share Doctor Profile
        DoctorProfileSharePage _shareProfile = new DoctorProfileSharePage(driver);
        _shareProfile.click_on_share().click();
        Thread.sleep(2000);


    }

}
