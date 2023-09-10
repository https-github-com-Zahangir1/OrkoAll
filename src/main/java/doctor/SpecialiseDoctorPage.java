package doctor;

import com.mongodb.binding.WriteBinding;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SpecialiseDoctorPage {
    AndroidDriver driver;

    public SpecialiseDoctorPage(AndroidDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    @FindBy(id ="com.orko.all:id/action_doctor")
    WebElement doctor_action;
    @FindBy(xpath ="//android.widget.LinearLayout[@content-desc=\"Neuro\"]")
    WebElement neurologist;
    @FindBy(xpath = "//android.widget.LinearLayout[@content-desc=\"Medicine\"]")
    WebElement medicine;
    @FindBy(xpath = "//android.widget.LinearLayout[@content-desc=\"Surgery\"]")
    WebElement surgery;
    @FindBy(xpath = "//android.widget.LinearLayout[@content-desc=\"Physio\"]")
    WebElement physio;
    @FindBy(xpath = "//android.widget.LinearLayout[@content-desc=\"Dentist\"]")
    WebElement dentist;
    @FindBy(xpath = "//android.widget.LinearLayout[@content-desc=\"Skin\"]")
    WebElement skin;
    @FindBy(xpath = "//android.widget.LinearLayout[@content-desc=\"Heart\"]")
    WebElement heart;
    @FindBy(xpath = "//android.widget.LinearLayout[@content-desc=\"Others\"]")
    WebElement others;
    @FindBy(id ="com.orko.all:id/btnCancel")
    WebElement cancelBtn;



    public WebElement click_on_doctor_action(){
        return doctor_action;
    }

    public WebElement click_on_neurologist(){
        return neurologist;
    }

    public WebElement click_on_medicine(){
        return medicine;
    }

    public WebElement click_on_surgery(){
        return surgery;
    }

    public WebElement click_on_physio(){
        return physio;
    }

    public WebElement click_on_dentist(){
        return dentist;
    }

    public WebElement click_on_skin(){
        return skin;
    }

    public WebElement click_on_heart(){
        return heart;
    }

    public WebElement click_on_others(){
        return others;
    }

    public WebElement click_on_cancelBtn(){
        return cancelBtn;
    }

}
