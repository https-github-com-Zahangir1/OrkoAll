package orkoCare.ourTeam.doctorProfile;

import authorised_Access.splashScreen.SplashScreen;
import base.BaseClass;
import org.testng.annotations.Test;
import orkoCare.ourTeam.doctorProfilePage.DoctorProfilePage;
import orkoCare.ourTeam.doctorProfilePage.UserFeedbackPage;

public class UserFeedback extends BaseClass {

    @Test
    public void userFeedback_test() throws InterruptedException {
        //Login
        Thread.sleep(2000);
        SplashScreen lg = new SplashScreen(driver);
        lg.login_homepage();

        //Our Team => Doctor Profile
        DoctorProfilePage dp = new DoctorProfilePage(driver);
        dp.click_on_ourTeam().click();
        Thread.sleep(4000);

        //User Feedback
        UserFeedbackPage user_feedback = new UserFeedbackPage(driver);
        user_feedback.click_on_ratingBtn().click();
        Thread.sleep(3000);
        user_feedback.click_on_image1().click();
        Thread.sleep(1000);
        user_feedback.click_on_image2().click();
        Thread.sleep(1000);
        user_feedback.click_on_image3().click();
        Thread.sleep(1000);
        user_feedback.set_title("Patient Satisfied Feedback");
        Thread.sleep(2000);
        user_feedback.set_review("I'm very satisfied");
        Thread.sleep(2000);
        user_feedback.click_on_submitBtn().click();
        Thread.sleep(4000);
        System.out.println("Patient feedback rating review");




    }
}
