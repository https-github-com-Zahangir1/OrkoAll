package moreFeatures.getHelp;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Contact_Us_Page {

    AndroidDriver driver;

    public Contact_Us_Page(AndroidDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id ="com.orko.all:id/btn_more")
    WebElement moreBtn;
    @FindBy(xpath = "//android.widget.LinearLayout[@content-desc=\"Get Help\"]")
    WebElement get_helpBtn;
    @FindBy(id ="com.orko.all:id/ll_contact_us")
    WebElement contactUs;


    public WebElement click_on_moreBtn(){
        return moreBtn;
    }

    public WebElement click_on_get_helpBtn(){
        return get_helpBtn;
    }

    public WebElement click_on_contactUs(){
        return contactUs;
    }




}
