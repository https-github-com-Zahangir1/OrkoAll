package moreFeatures.feedBack;

import authorised_Access.splashScreen.SplashScreen;
import base.BaseClass;
import org.testng.annotations.Test;

public class Search extends BaseClass {

    @Test
    public void searchTest() throws InterruptedException {
        //Login
        Thread.sleep(2000);
        SplashScreen lg = new SplashScreen(driver);
        lg.login_homepage();

        //Search Feedback
        Search_Page search = new Search_Page(driver);
        search.click_on_moreBtn().click();
        Thread.sleep(2000);
        search.click_on_feedback().click();
        Thread.sleep(2000);
        search.click_on_likeBtn().click();
        Thread.sleep(2000);
        search.click_on_excellentBtn().click();
        Thread.sleep(2000);
        search.set_on_feedbackComment("Working fine");
        Thread.sleep(2000);
        search.click_on_submitBtn().click();
        Thread.sleep(3000);
        System.out.println("Search Feedback");
    }

}
