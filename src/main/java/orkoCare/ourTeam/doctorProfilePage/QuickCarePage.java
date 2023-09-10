package orkoCare.ourTeam.doctorProfilePage;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QuickCarePage {

    AndroidDriver driver;

    public QuickCarePage(AndroidDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    @FindBy(id ="com.orko.all:id/fab_quick_care")
    WebElement quickCare;
    @FindBy(id = "com.orko.all:id/ll_parent")
    WebElement select_patient;
    @FindBy(id = "com.orko.all:id/btnYes")
    WebElement yesBtn;

    public WebElement click_on_quickCare(){
        return quickCare;
    }

    public WebElement click_on_select_patient(){
        return select_patient;
    }

    public WebElement click_on_yesBtn(){
        return yesBtn;
    }


}
