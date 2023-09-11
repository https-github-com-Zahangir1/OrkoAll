package patientProfile.profilePage;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Prescription_Page {

    AndroidDriver driver;

    public Prescription_Page(AndroidDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    @FindBy(id ="com.orko.all:id/imgProfilePic")
    WebElement pt_profile;
    @FindBy(id ="com.orko.all:id/ll_parent")
    WebElement parent;
    @FindBy(xpath ="//android.widget.LinearLayout[@content-desc=\"Prescriptions\"]")
    WebElement prescription;
    @FindBy(xpath ="//android.widget.LinearLayout[@content-desc=\"Reports\"]")
    WebElement report;
    @FindBy(xpath = "//android.widget.LinearLayout[@content-desc=\"Invoice\"]")
    WebElement invoice;
    @FindBy(xpath = "//android.widget.LinearLayout[@content-desc=\"Images\"]")
    WebElement image;

    public WebElement click_on_pt_profile(){
        return pt_profile;
    }

    public  WebElement click_on_parent(){
        return parent;
    }

    public WebElement click_on_prescription(){
        return prescription;
    }

    public WebElement click_on_report(){
        return report;
    }

    public WebElement click_on_invoice(){
        return invoice;
    }

    public WebElement click_on_image(){
        return image;
    }



}
