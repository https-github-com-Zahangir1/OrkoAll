package moreFeatures.getHelp;

import authorised_Access.splashScreen.SplashScreen;
import base.BaseClass;
import org.testng.annotations.Test;

public class Share_Orko extends BaseClass {

    @Test
    public void share_OrkoApp() throws InterruptedException {
        //Login
        Thread.sleep(2000);
        SplashScreen lg = new SplashScreen(driver);
        lg.login_homepage();

        //Share Orko Apps
        Share_Orko_Page _share = new Share_Orko_Page(driver);
        _share.click_on_moreBtn().click();
        Thread.sleep(2000);
        _share.click_on_get_helpBtn().click();
        Thread.sleep(2000);
        _share.click_on_shareFriend().click();
        Thread.sleep(2000);
        _share.click_on_sharePatient().click();
        Thread.sleep(2000);
        _share.click_on_shareBtn().click();
        Thread.sleep(2000);
        System.out.println("Share Orko Apps with Friends");


    }
}
