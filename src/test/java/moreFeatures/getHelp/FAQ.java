package moreFeatures.getHelp;

import authorised_Access.splashScreen.SplashScreen;
import base.BaseClass;
import org.testng.annotations.Test;

public class FAQ extends BaseClass {
    @Test
    public void faqTest() throws InterruptedException {
        //Login
        Thread.sleep(2000);
        SplashScreen lg = new SplashScreen(driver);
        lg.login_homepage();

        //FAQ
        FAQ_Page _faq = new FAQ_Page(driver);
        _faq.click_on_moreBtn().click();
        Thread.sleep(2000);
        _faq.click_on_get_helpBtn().click();
        Thread.sleep(2000);
        _faq.click_on_faq().click();
        Thread.sleep(2000);
        _faq.click_on_faq_text().click();
        Thread.sleep(2000);
        System.out.println("FAQ");



    }
}
