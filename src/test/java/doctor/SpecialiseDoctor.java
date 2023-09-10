package doctor;

import authorised_Access.splashScreen.SplashScreen;
import base.BaseClass;
import org.testng.annotations.Test;


public class SpecialiseDoctor extends BaseClass {

    @Test
    public void our_teamTest() throws InterruptedException {
        //Login
        Thread.sleep(2000);
        SplashScreen lg = new SplashScreen(driver);
        lg.login_homepage();

        //Doctor Tab
        SpecialiseDoctorPage _doctor = new SpecialiseDoctorPage(driver);
        _doctor.click_on_doctor_action().click();
        Thread.sleep(2000);
        _doctor.click_on_neurologist().click();
        Thread.sleep(2000);
        _doctor.click_on_medicine().click();
        Thread.sleep(2000);
        _doctor.click_on_surgery().click();
        Thread.sleep(2000);
        _doctor.click_on_physio().click();
        Thread.sleep(2000);
        _doctor.click_on_dentist().click();
        Thread.sleep(2000);
        _doctor.click_on_skin().click();
        Thread.sleep(2000);
        _doctor.click_on_heart().click();
        Thread.sleep(2000);
        _doctor.click_on_others().click();
        Thread.sleep(5000);
        _doctor.click_on_cancelBtn().click();
        Thread.sleep(2000);
        driver.navigate().back();
        //driver.navigate().refresh();
        //driver.navigate().to("url");
        _doctor.click_on_medicine().click();
        Thread.sleep(2000);


    }

}
