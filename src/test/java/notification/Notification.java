package notification;

import authorised_Access.splashScreen.SplashScreen;
import base.BaseClass;
import org.testng.annotations.Test;

public class Notification extends BaseClass {

    @Test
    public void notification_Test() throws InterruptedException {
        //Login
        Thread.sleep(2000);
        SplashScreen lg = new SplashScreen(driver);
        lg.login_homepage();

        //Notification
        NotificationPage notify = new NotificationPage(driver);
        notify.click_on_notification().click();
        Thread.sleep(3000);
        System.out.println("Notification tab successfully visited");
    }



}
