package credential;


import base.BaseClass;
import org.testng.annotations.Test;
import authorised_Access.credentialPage.RegisterPage;


public class Register extends BaseClass {

    @Test
    public void RegisterTest() throws InterruptedException {
        //Register
        Thread.sleep(3000);
        RegisterPage _reg = new RegisterPage(driver);
        for (int i = 1; i <= 2; i++) {
            _reg.click_on_splash_screen().click();
            Thread.sleep(2000);
        }

        _reg.click_on_doneBtn().click();
        Thread.sleep(1000);
        _reg.click_on_registerBtn().click();
        Thread.sleep(1000);
        _reg.click_on_register_with_phone().click();
        Thread.sleep(1000);
        _reg.set_your_fistName("Test");
        Thread.sleep(1000);
        _reg.set_your_lastName("Patient-13");
        Thread.sleep(1000);
        _reg.set_your_phoneNumber("01000292947");
        Thread.sleep(1000);
        _reg.set_your_email("");
        Thread.sleep(1000);
        _reg.click_on_submitBtn().click();
        Thread.sleep(5000);
        _reg.setVerify_otpOne("4");
        Thread.sleep(1000);
        _reg.setVerify_otpTwo("4");
        Thread.sleep(1000);
        _reg.setVerify_otpThree("0");
        Thread.sleep(1000);
        _reg.setVerify_otpFour("0");
        Thread.sleep(1000);
        _reg.setVerify_otpFive("5");
        Thread.sleep(1000);
        _reg.setVerify_otpSix("5");
        Thread.sleep(1000);
        _reg.click_on_continueBtn().click();
        Thread.sleep(1000);
        _reg.click_on_getStartedBtn().click();
        Thread.sleep(1000);
        _reg.click_on_permission_allow().click();
        Thread.sleep(1000);
        _reg.click_on_allowBtn().click();
        Thread.sleep(1000);
        _reg.set_patient_age("20");
        Thread.sleep(1000);
        _reg.set_patient_month("03");
        Thread.sleep(1000);
        _reg.click_on_gender().click();
        Thread.sleep(1000);
        _reg.click_on_bloodGroup().click();
        Thread.sleep(1000);
        /*_reg.click_on_byProfession().click();
        Thread.sleep(1000);*/
        _reg.click_on_location().click();
        Thread.sleep(1000);
        _reg.set_searchLocation("Panchlaish");
        Thread.sleep(1000);
        /*_reg.set_searchLocation();
        Thread.sleep(1000);*/
        _reg.click_on_this_location().click();
        Thread.sleep(1000);
        _reg.click_on_submit_btn().click();
        Thread.sleep(5000);





        //Assertion
        /*WebElement result = driver.findElement(By.id("com.orko.all:id/logo"));
        Assert.assertEquals(result.getText(), "");
        System.out.println("Successfully Login");*/

    }

}
