package notification;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NotificationPage {

    AndroidDriver driver;

    public NotificationPage(AndroidDriver driver){
        this.driver =driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "com.orko.all:id/actionNotification")
    WebElement notification;


    public WebElement click_on_notification(){
        return notification;
    }



}
