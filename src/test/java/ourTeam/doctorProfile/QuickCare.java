package ourTeam.doctorProfile;

import authorised_Access.splashScreen.SplashScreen;
import base.BaseClass;
import org.testng.annotations.Test;
import orkoCare.ourTeam.doctorProfilePage.DoctorProfilePage;
import orkoCare.ourTeam.doctorProfilePage.QuickCarePage;

public class QuickCare extends BaseClass {

    @Test
    public void quickCareTest() throws InterruptedException {
        //Login
        Thread.sleep(2000);
        SplashScreen lg = new SplashScreen(driver);
        lg.login_homepage();

        //Our Team => Doctor Profile
        DoctorProfilePage dp = new DoctorProfilePage(driver);
        dp.click_on_ourTeam().click();
        Thread.sleep(4000);

        //Quick Care
        QuickCarePage qc = new QuickCarePage(driver);
        qc.click_on_quickCare().click();
        Thread.sleep(3000);
        qc.click_on_select_patient().click();
        Thread.sleep(3000);
        qc.click_on_yesBtn().click();
        Thread.sleep(3000);
        System.out.println("Quick Care Set");




    }


}
