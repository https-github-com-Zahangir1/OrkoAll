package moreFeatures.feedBack;

import authorised_Access.splashScreen.SplashScreen;
import base.BaseClass;
import org.testng.annotations.Test;

public class Profile extends BaseClass {

    @Test
    public void profileTest() throws InterruptedException {
        //Login
        Thread.sleep(2000);
        SplashScreen lg = new SplashScreen(driver);
        lg.login_homepage();

        //Profile Feedback
        Profile_Page _profile = new Profile_Page(driver);
        _profile.click_on_moreBtn().click();
        Thread.sleep(2000);
        _profile.click_on_feedback().click();
        Thread.sleep(2000);
        _profile.click_on_likeBtn().click();
        Thread.sleep(2000);
        _profile.click_on_excellentBtn().click();
        Thread.sleep(2000);
        _profile.set_on_feedbackComment("Good!");
        Thread.sleep(2000);
        _profile.click_on_submitBtn().click();
        Thread.sleep(3000);
        System.out.println("Profile Feedback");
    }

}
