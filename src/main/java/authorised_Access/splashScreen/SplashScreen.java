package authorised_Access.splashScreen;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.support.PageFactory;
import authorised_Access.credentialPage.LoginPage;

public class SplashScreen {

    AndroidDriver driver;

    public SplashScreen(AndroidDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void login_homepage() throws InterruptedException {
        Thread.sleep(3000);
        LoginPage _all = new LoginPage(driver);
        for (int i = 1; i <= 2; i++) {
            _all.click_on_splash_screen().click();
            Thread.sleep(2000);
        }

        _all.click_on_doneBtn().click();
        Thread.sleep(3000);
        _all.click_on_loginBtn().click();
        Thread.sleep(3000);
        _all.setPhone_number("01000292933");
        Thread.sleep(2000);
        _all.click_on_nextBtn().click();
        Thread.sleep(2000);
        _all.setVerify_otpOne("4");
        Thread.sleep(2000);
        _all.setVerify_otpTwo("4");
        Thread.sleep(2000);
        _all.setVerify_otpThree("0");
        Thread.sleep(2000);
        _all.setVerify_otpFour("0");
        Thread.sleep(2000);
        _all.setVerify_otpFive("5");
        Thread.sleep(2000);
        _all.setVerify_otpSix("5");
        Thread.sleep(2000);
        _all.click_on_continueBtn().click();
        Thread.sleep(5000);



    }

}
