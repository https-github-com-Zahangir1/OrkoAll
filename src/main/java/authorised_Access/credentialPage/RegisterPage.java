package authorised_Access.credentialPage;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {

    AndroidDriver driver;

    public RegisterPage(AndroidDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "com.orko.all:id/next")
    WebElement splash_screen;
    @FindBy(id = "com.orko.all:id/done")
    WebElement doneBtn;
    @FindBy(id = "com.orko.all:id/btn_register")
    WebElement registerBtn;
    @FindBy(id = "com.orko.all:id/btn_register_with_phone")
    WebElement register_with_phone;
    @FindBy(id = "com.orko.all:id/etFirstName")
    WebElement firstName;
    @FindBy(id = "com.orko.all:id/etLastName")
    WebElement lastName;
    @FindBy(id = "com.orko.all:id/etMobileNo")
    WebElement phoneNumber;
    @FindBy(id = "com.orko.all:id/etEmail")
    WebElement email;
    @FindBy(id = "com.orko.all:id/btn_next")
    WebElement submitBtn;
    @FindBy(id = "com.orko.all:id/otp_one_edit_text")
    WebElement otp_One;
    @FindBy(id = "com.orko.all:id/otp_two_edit_text")
    WebElement otp_Two;
    @FindBy(id = "com.orko.all:id/otp_three_edit_text")
    WebElement otp_Three;
    @FindBy(id = "com.orko.all:id/otp_four_edit_text")
    WebElement otp_Four;
    @FindBy(id = "com.orko.all:id/otp_five_edit_text")
    WebElement otp_Five;
    @FindBy(id = "com.orko.all:id/otp_six_edit_text")
    WebElement otp_Six;
    @FindBy(id = "com.orko.all:id/btn_continue")
    WebElement continueBtn;
    @FindBy(id= "com.orko.all:id/btn_register_with_phone")
    WebElement getStartedBtn;
    @FindBy(id = "com.android.permissioncontroller:id/permission_allow_one_time_button")
    WebElement permission_allow;
    @FindBy(id = "com.android.permissioncontroller:id/permission_allow_button")
    WebElement allowBtn;
    @FindBy(id = "com.orko.all:id/etYY")
    WebElement age;
    @FindBy(id = "com.orko.all:id/etMM")
    WebElement month;
    @FindBy(id = "com.orko.all:id/chipMale")
    WebElement gender;
    @FindBy(id = "com.orko.all:id/tvAPlus")
    WebElement bloodGroup;

    @FindBy(id = "com.orko.all:id/etDisease")
    WebElement searchDisease;
    @FindBy(id = "com.orko.all:id/edit_text_nature_of_service")
    WebElement byProfession;
    @FindBy(id = "com.orko.all:id/autoLocation")
    WebElement location;
    @FindBy (id = "com.orko.all:id/searchBox")
    WebElement searchLocation;
    @FindBy(id = "com.orko.all:id/text1")
    WebElement select_location;
    @FindBy (id = "com.orko.all:id/btn_next")
    WebElement submit_btn;



    public WebElement click_on_splash_screen() {
        return splash_screen;
    }

    public WebElement click_on_doneBtn() {
        return doneBtn;
    }

    public WebElement click_on_registerBtn(){
        return registerBtn;
    }

    public WebElement click_on_register_with_phone(){
        return register_with_phone;
    }

    public void set_your_fistName(String f_name){
        firstName.sendKeys(f_name);
    }

    public void set_your_lastName(String l_name){
        lastName.sendKeys(l_name);
    }

    public void set_your_phoneNumber(String phone){
        phoneNumber.sendKeys(phone);
    }

    public void set_your_email(String e_mail){
        email.sendKeys(e_mail);
    }

    public WebElement click_on_submitBtn(){
        return submitBtn;
    }

    public void setVerify_otpOne(String one){
        otp_One.sendKeys(one);
    }
    public void setVerify_otpTwo(String two){
        otp_Two.sendKeys(two);
    }
    public void setVerify_otpThree(String three){
        otp_Three.sendKeys(three);
    }
    public void setVerify_otpFour(String four){
        otp_Four.sendKeys(four);
    }
    public void setVerify_otpFive(String five){
        otp_Five.sendKeys(five);
    }
    public void setVerify_otpSix(String six){
        otp_Six.sendKeys(six);
    }
    public WebElement click_on_continueBtn(){
        return continueBtn;
    }

    public WebElement click_on_getStartedBtn(){
        return getStartedBtn;
    }

    public WebElement click_on_permission_allow(){
        return permission_allow;
    }

    public WebElement click_on_allowBtn(){
        return allowBtn;
    }

    public void set_patient_age(String pt_age){
        age.sendKeys(pt_age);
    }

    public void set_patient_month(String pt_month){
        month.sendKeys(pt_month);
    }

    public WebElement click_on_gender(){
        return gender;
    }

    public WebElement click_on_bloodGroup(){
        return bloodGroup;
    }

    public void set_searchDisease(String disease){
        searchDisease.sendKeys(disease);
        searchDisease.sendKeys(Keys.TAB);
    }

    public WebElement click_on_byProfession(){
        return byProfession;
    }

    public WebElement click_on_location(){
        return location;
    }

    public void set_searchLocation(String s_location){
        searchLocation.sendKeys(s_location);
//        searchLocation.sendKeys(Keys.ENTER);
    }

    public void set_searchLocation(){
        searchLocation.sendKeys(Keys.ENTER);
    }

    public WebElement click_on_this_location(){
        return select_location;
    }

    public WebElement click_on_submit_btn(){
        return submit_btn;
    }



}