package moreFeatures.feedBack;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Profile_Page {

    AndroidDriver driver;

    public Profile_Page(AndroidDriver driver){
        this.driver =driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id ="com.orko.all:id/btn_more")
    WebElement moreBtn;
    @FindBy(xpath = "//android.widget.LinearLayout[@content-desc=\"Feedback\"]")
    WebElement feedback;
    @FindBy(xpath ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.cardview.widget.CardView/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.widget.RelativeLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.LinearLayout/android.widget.ImageView[1]")
    WebElement likeBtn;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.cardview.widget.CardView/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.widget.RelativeLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.GridView/android.view.ViewGroup[1]/android.widget.TextView")
    WebElement excellentBtn;
    @FindBy(id ="com.orko.all:id/etFeedbackComment")
    WebElement feedbackComment;
    @FindBy(id ="com.orko.all:id/tv_submit")
    WebElement submitBtn;


    public WebElement click_on_moreBtn(){
        return moreBtn;
    }

    public WebElement click_on_feedback(){
        return feedback;
    }

    public WebElement click_on_likeBtn(){
        return likeBtn;
    }

    public WebElement click_on_excellentBtn(){
        return excellentBtn;
    }

    public void set_on_feedbackComment(String comment){
        feedbackComment.sendKeys(comment);
    }

    public WebElement click_on_submitBtn(){
        return submitBtn;
    }


}
