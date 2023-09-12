package moreFeatures.getHelp;

import authorised_Access.splashScreen.SplashScreen;
import base.BaseClass;
import org.testng.annotations.Test;

public class Privacy_Policy extends BaseClass {

    @Test
    public void privacy_policyTest() throws InterruptedException {
        //Login
        Thread.sleep(2000);
        SplashScreen lg = new SplashScreen(driver);
        lg.login_homepage();

        //Privacy Policy
        Privacy_Policy_Page _privacy = new Privacy_Policy_Page(driver);
        _privacy.click_on_moreBtn().click();
        Thread.sleep(2000);
        _privacy.click_on_get_helpBtn().click();
        Thread.sleep(2000);
        _privacy.click_on_privacy().click();
        Thread.sleep(3000);
        System.out.println("Privacy Policy");

    }
}
