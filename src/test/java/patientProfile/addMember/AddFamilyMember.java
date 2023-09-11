package patientProfile.addMember;

import authorised_Access.splashScreen.SplashScreen;
import base.BaseClass;
import org.testng.annotations.Test;
import patientProfile.add_member.AddFamilyMember_Page;

public class AddFamilyMember extends BaseClass {


    @Test
    public void addFamilyMemberTest() throws InterruptedException {
        //Login
        Thread.sleep(2000);
        SplashScreen lg = new SplashScreen(driver);
        lg.login_homepage();

        //Add Family Member
        AddFamilyMember_Page family = new AddFamilyMember_Page(driver);
        family.click_on_pt_profile().click();
        Thread.sleep(2000);
        family.click_on_addMember().click();
        Thread.sleep(2000);
        family.click_on_permission_allow().click();
        Thread.sleep(2000);
        family.click_on_allow().click();
        Thread.sleep(2000);
        family.set_fullName("Manshiur Rahman");
        Thread.sleep(2000);
        family.set_phoneNumber("01000292951");
        Thread.sleep(3000);
        family.set_on_year("25");
        Thread.sleep(2000);
        family.set_on_month("05");
        Thread.sleep(2000);
        family.click_on_gender().click();
        Thread.sleep(2000);
        family.click_on_blood().click();
        Thread.sleep(2000);
        family.click_on_relationship().click();
        Thread.sleep(2000);
        /*family.click_on_disease().click();
        Thread.sleep(2000);
        family.click_on_profession().click();
        Thread.sleep(2000);*/
        family.click_on_location().click();
        Thread.sleep(2000);
        family.set_on_searchLocation("Adabor, Dhaka");
        Thread.sleep(2000);
        family.click_on_select_location().click();
        Thread.sleep(2000);
        family.click_on_completeBtn().click();
        Thread.sleep(2000);



    }

}
