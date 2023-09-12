package moreFeatures.getHelp;

import authorised_Access.splashScreen.SplashScreen;
import base.BaseClass;
import org.testng.annotations.Test;

public class About_Us extends BaseClass {
    @Test
    public void aboutUsTest() throws InterruptedException {
        //Login
        Thread.sleep(2000);
        SplashScreen lg = new SplashScreen(driver);
        lg.login_homepage();

        //About Us
        About_Us_Page about = new About_Us_Page(driver);
        about.click_on_moreBtn().click();
        Thread.sleep(2000);
        about.click_on_get_helpBtn().click();
        Thread.sleep(2000);
        about.click_on_aboutUs().click();
        Thread.sleep(3000);
        System.out.println("About Us");


    }

}
