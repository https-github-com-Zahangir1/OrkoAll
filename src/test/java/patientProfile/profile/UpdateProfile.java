package appointment.profile;

import authorised_Access.splashScreen.SplashScreen;
import base.BaseClass;
import org.testng.annotations.Test;
import patientProfile.profilePage.Update_Profile_Page;

public class UpdateProfile extends BaseClass {

    @Test
    public void updateProfileTest() throws InterruptedException {
        //Login
        Thread.sleep(2000);
        SplashScreen lg = new SplashScreen(driver);
        lg.login_homepage();

        //Update Profile
        Update_Profile_Page updateProfile = new Update_Profile_Page(driver);
        updateProfile.click_on_pt_profile().click();
        Thread.sleep(2000);
        updateProfile.click_on_parent().click();
        Thread.sleep(2000);
        updateProfile.click_on_editProfile().click();
        Thread.sleep(2000);
        updateProfile.click_on_permission_allow().click();
        Thread.sleep(2000);
        updateProfile.click_on_allow().click();
        Thread.sleep(2000);
        updateProfile.click_on_location().click();
        Thread.sleep(2000);
        updateProfile.set_on_searchLocation("Banani, Dhaka");
        Thread.sleep(2000);
        updateProfile.click_on_select_location().click();
        Thread.sleep(2000);
        updateProfile.click_on_updateBtn().click();
        Thread.sleep(2000);
        updateProfile.click_on_refer_moreBtn().click();
        Thread.sleep(2000);
        updateProfile.click_on_refer_doctor().click();
        Thread.sleep(2000);
        updateProfile.click_on_select_refer_doctor().click();
        Thread.sleep(2000);
        updateProfile.click_on_connectionBtn().click();
        Thread.sleep(3000);
        System.out.println("Updated on Profile and Refer Doctor");











    }

}
