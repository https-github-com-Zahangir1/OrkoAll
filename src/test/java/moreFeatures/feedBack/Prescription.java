package moreFeatures.feedBack;

import authorised_Access.splashScreen.SplashScreen;
import base.BaseClass;
import org.testng.annotations.Test;

public class Prescription extends BaseClass {

   @Test
    public void prescriptionTest() throws InterruptedException {
        //Login
        Thread.sleep(2000);
        SplashScreen lg = new SplashScreen(driver);
        lg.login_homepage();

        //Prescription Feedback
        Prescription_Page pre = new Prescription_Page(driver);
        pre.click_on_moreBtn().click();
        Thread.sleep(2000);
        pre.click_on_feedback().click();
        Thread.sleep(2000);
        pre.click_on_likeBtn().click();
        Thread.sleep(2000);
        pre.click_on_excellentBtn().click();
        Thread.sleep(2000);
        pre.set_on_feedbackComment("Very nice system");
        Thread.sleep(2000);
        pre.click_on_submitBtn().click();
        Thread.sleep(3000);
        System.out.println("Prescription Feedback");

    }

}
