package orkoCare.ourTeam.doctorProfilePage;


import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SendMessagePage {

    AndroidDriver driver;

    public SendMessagePage(AndroidDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "com.orko.all:id/chipSendMessage")
    WebElement sendMessage;
    @FindBy(id = "com.orko.all:id/ll_parent")
    WebElement select_patient;
    @FindBy(id ="com.orko.all:id/etSendMessage")
    WebElement typeMessage;
    @FindBy(id = "com.orko.all:id/btnSendMessage")
    WebElement sendBtn;


    public WebElement click_on_sendMessage(){
        return sendMessage;
    }

    public WebElement click_on_select_patient(){
        return select_patient;
    }

    public void set_on_typeMessage(String text){
        typeMessage.sendKeys(text);
    }

    public WebElement click_on_sendBtn(){
        return sendBtn;
    }



}

