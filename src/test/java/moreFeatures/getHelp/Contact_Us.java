package moreFeatures.getHelp;

import authorised_Access.splashScreen.SplashScreen;
import base.BaseClass;
import org.testng.annotations.Test;

public class Contact_Us extends BaseClass {
    @Test
    public  void contactUsTest() throws InterruptedException {
        //Login
        Thread.sleep(2000);
        SplashScreen lg = new SplashScreen(driver);
        lg.login_homepage();

        //Contact Us
        Contact_Us_Page contact = new Contact_Us_Page(driver);
        contact.click_on_moreBtn().click();
        Thread.sleep(2000);
        contact.click_on_get_helpBtn().click();
        Thread.sleep(2000);
        contact.click_on_contactUs().click();
        Thread.sleep(2000);
        System.out.println("Contact Us");

    }
}
