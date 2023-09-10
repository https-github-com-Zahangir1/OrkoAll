package credential;

import base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import authorised_Access.splashScreen.SplashScreen;
import org.testng.annotations.Test;

public class Login extends BaseClass {

    @Test
    public void loginTest() throws InterruptedException {
        //Login Page
        Thread.sleep(2000);
        SplashScreen lg = new SplashScreen(driver);
        lg.login_homepage();

        //Assertion
        WebElement result = driver.findElement(By.id("com.orko.all:id/logo"));
        Assert.assertEquals(result.getText(), "");
        System.out.println("Successfully Login");


    }

}
