package moreFeatures.feedBack;

import authorised_Access.splashScreen.SplashScreen;
import base.BaseClass;
import org.testng.annotations.Test;

public class Chat extends BaseClass {
    @Test
    public void chatTest() throws InterruptedException {
        //Login
        Thread.sleep(2000);
        SplashScreen lg = new SplashScreen(driver);
        lg.login_homepage();

        //Chat Feedback
        Chat_Page chat = new Chat_Page(driver);
        chat.click_on_moreBtn().click();
        Thread.sleep(2000);
        chat.click_on_feedback().click();
        Thread.sleep(2000);
        chat.click_on_likeBtn().click();
        Thread.sleep(2000);
        chat.click_on_excellentBtn().click();
        Thread.sleep(2000);
        chat.set_on_feedbackComment("Smoothly working");
        Thread.sleep(2000);
        chat.click_on_submitBtn().click();
        Thread.sleep(3000);
        System.out.println("Chat Feedback");



    }
}
