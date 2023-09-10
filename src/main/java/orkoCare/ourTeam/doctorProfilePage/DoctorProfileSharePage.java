package orkoCare.ourTeam.doctorProfilePage;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DoctorProfileSharePage {

    AndroidDriver driver;

    public DoctorProfileSharePage(AndroidDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    @FindBy(id ="com.orko.all:id/imgShare")
    WebElement share;

    public WebElement click_on_share(){
        return share;
    }



}
