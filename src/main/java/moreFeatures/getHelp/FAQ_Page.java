package moreFeatures.getHelp;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FAQ_Page {

    AndroidDriver driver;

    public FAQ_Page(AndroidDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id ="com.orko.all:id/btn_more")
    WebElement moreBtn;
    @FindBy(xpath = "//android.widget.LinearLayout[@content-desc=\"Get Help\"]")
    WebElement get_helpBtn;
    @FindBy(id = "com.orko.all:id/ll_faq")
    WebElement faq;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ExpandableListView/android.widget.LinearLayout[1]")
    WebElement faq_text;


    public WebElement click_on_moreBtn(){
        return moreBtn;
    }

    public WebElement click_on_get_helpBtn(){
        return get_helpBtn;
    }

    public WebElement click_on_faq(){
        return faq;
    }

    public WebElement click_on_faq_text(){
        return faq_text;
    }





}
