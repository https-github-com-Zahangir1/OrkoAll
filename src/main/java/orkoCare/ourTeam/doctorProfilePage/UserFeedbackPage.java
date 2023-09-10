package orkoCare.ourTeam.doctorProfilePage;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class UserFeedbackPage {

    AndroidDriver driver;

    public UserFeedbackPage(AndroidDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(id ="com.orko.all:id/imgRating")
    WebElement ratingBtn;
    @FindBy(id = "com.orko.all:id/image1")
    WebElement image1;
    @FindBy(id = "com.orko.all:id/image2")
    WebElement image2;
    @FindBy(id ="com.orko.all:id/image3")
    WebElement image3;
    @FindBy(id = "com.orko.all:id/etTitle")
    WebElement title;
    @FindBy(id = "com.orko.all:id/etReview")
    WebElement review;
    @FindBy(id ="com.orko.all:id/textViewNext")
    WebElement submitBtn;


    public WebElement click_on_ratingBtn(){
        return ratingBtn;
    }

    public WebElement click_on_image1(){
        return image1;
    }

    public WebElement click_on_image2(){
        return image2;
    }

    public WebElement click_on_image3(){
        return image3;
    }

    public void set_title(String t){
        title.sendKeys(t);
    }

    public void set_review(String r){
        review.sendKeys(r);
    }

    public WebElement click_on_submitBtn(){
        return submitBtn;
    }



}
