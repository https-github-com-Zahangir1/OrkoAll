package moreFeatures.feedBack;

import authorised_Access.splashScreen.SplashScreen;
import base.BaseClass;
import org.testng.annotations.Test;

public class Call extends BaseClass {
    @Test
    public void callTest() throws InterruptedException {
        //Login
        Thread.sleep(2000);
        SplashScreen lg = new SplashScreen(driver);
        lg.login_homepage();

        //Call Feedback
        Call_Page _call = new Call_Page(driver);
        _call.click_on_moreBtn().click();
        Thread.sleep(2000);
        _call.click_on_feedback().click();
        Thread.sleep(2000);
        _call.click_on_likeBtn().click();
        Thread.sleep(2000);
        _call.click_on_goodBtn().click();
        Thread.sleep(2000);
        _call.click_on_submitBtn().click();
        Thread.sleep(3000);
        System.out.println("Call Feedback");


    }
}
