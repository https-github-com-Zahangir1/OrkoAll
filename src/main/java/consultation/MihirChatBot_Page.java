package consultation;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class MihirChatBot_Page {

    AndroidDriver driver;

    public MihirChatBot_Page(AndroidDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    @FindBy(id ="com.orko.all:id/action_consultation")
    WebElement consultation;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.cardview.widget.CardView/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout")
    WebElement chatBot;
    @FindBy(id ="com.orko.all:id/llCallLayout")
    WebElement callLayout;
    @FindBy(id ="com.orko.all:id/ll_search_help")
    WebElement search_help;




    public WebElement click_on_consultation(){
        return consultation;
    }

    public WebElement click_on_chatBot(){
        return chatBot;
    }

    public WebElement click_on_callLayout(){
        return callLayout;
    }

    public WebElement click_on_search_help(){
        return search_help;
    }





}
