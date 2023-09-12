package moreFeatures.getHelp;

import authorised_Access.splashScreen.SplashScreen;
import base.BaseClass;
import org.testng.annotations.Test;

public class Terms_Conditions extends BaseClass {
    @Test
    public void terms_conditionTest() throws InterruptedException {
        //Login
        Thread.sleep(2000);
        SplashScreen lg = new SplashScreen(driver);
        lg.login_homepage();

        //Terms and Condition
        Terms_Conditions_Page terms = new Terms_Conditions_Page(driver);
        terms.click_on_moreBtn().click();
        Thread.sleep(2000);
        terms.click_on_get_helpBtn().click();
        Thread.sleep(2000);
        terms.click_on_terms_condition().click();
        Thread.sleep(2000);
        System.out.println("Terms and Condition");

    }

}
