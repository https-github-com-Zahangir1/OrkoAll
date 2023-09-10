package ourTeam.doctorProfile;

import authorised_Access.splashScreen.SplashScreen;
import base.BaseClass;
import org.testng.annotations.Test;
import orkoCare.ourTeam.doctorProfilePage.DoctorProfilePage;
import orkoCare.ourTeam.doctorProfilePage.SendMessagePage;

public class SendMessage extends BaseClass {

    @Test
    public void sendMessageTest() throws InterruptedException {
        //Login
        Thread.sleep(2000);
        SplashScreen lg = new SplashScreen(driver);
        lg.login_homepage();

        //Our Team => Doctor Profile
        DoctorProfilePage dp = new DoctorProfilePage(driver);
        dp.click_on_ourTeam().click();
        Thread.sleep(4000);

        //Send Message
        SendMessagePage msg = new SendMessagePage(driver);
        msg.click_on_sendMessage().click();
        Thread.sleep(3000);
        msg.click_on_select_patient().click();
        Thread.sleep(3000);
        msg.set_on_typeMessage("Good Evening! I need your help?");
        Thread.sleep(3000);
        msg.click_on_sendBtn().click();
        Thread.sleep(5000);
        System.out.println("Patient send a message");

    }

}
