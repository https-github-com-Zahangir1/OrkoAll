package patientProfile.add_member;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddFamilyMember_Page {

    AndroidDriver driver;
    public AddFamilyMember_Page(AndroidDriver driver){
        this.driver =driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(id ="com.orko.all:id/imgProfilePic")
    WebElement pt_profile;
    @FindBy(id ="com.orko.all:id/btn_add_member")
    WebElement addMember;
    @FindBy(id = "com.android.permissioncontroller:id/permission_allow_foreground_only_button")
    WebElement permission_allow;
    @FindBy(id ="com.android.permissioncontroller:id/permission_allow_button")
    WebElement allow;
    @FindBy(id ="com.orko.all:id/etFullName")
    WebElement fullName;
    @FindBy(id ="com.orko.all:id/til_phone")
    WebElement phoneNumber;
    @FindBy(id ="com.orko.all:id/etYY")
    WebElement year;
    @FindBy(id ="com.orko.all:id/etMM")
    WebElement month;
    @FindBy(id ="com.orko.all:id/chipMale")
    WebElement gender;
    @FindBy(id ="com.orko.all:id/tvAPlus")
    WebElement blood;
    @FindBy(id ="com.orko.all:id/edit_text_relationship")
    WebElement relationship;
    @FindBy(id ="com.orko.all:id/etDisease")
    WebElement disease;
    @FindBy(id ="com.orko.all:id/edit_text_nature_of_service")
    WebElement profession;
    @FindBy(id ="com.orko.all:id/autoLocation")
    WebElement location;
    @FindBy(id ="com.orko.all:id/ivGoNext")
    WebElement complete;



    public WebElement click_on_pt_profile(){
        return pt_profile;
    }
    public WebElement click_on_addMember(){
        return addMember;
    }
    public WebElement click_on_permission_allow(){
        return permission_allow;
    }
    public WebElement click_on_allow(){
        return allow;
    }
    public void set_fullName(String name){
        fullName.sendKeys(name);
    }
    public void set_phoneNumber(String phn){
        phoneNumber.sendKeys(phn);
    }
    public void set_year(String y){
        year.sendKeys(y);
    }
    public void set_month(String m){
        month.sendKeys(m);
    }
    public WebElement click_on_gender(){
        return gender;
    }
    public WebElement click_on_blood(){
        return blood;
    }
    public WebElement click_on_relationship(){
        return relationship;
    }
    public WebElement click_on_disease(){
        return disease;
    }
    public WebElement click_on_profession(){
        return profession;
    }
    public void set_location(String state){
        location.sendKeys(state);
    }
    public WebElement click_on_completeBtn(){
        return complete;
    }






}
