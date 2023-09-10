package orkoCare.appointmentPage;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AppointmentPage {
    AndroidDriver driver;

    public AppointmentPage(AndroidDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "com.orko.all:id/fabOrkoCare")
    WebElement appointment;
    @FindBy(id = "com.orko.all:id/ll_parent")
    WebElement select_patient;
    @FindBy(id = "com.orko.all:id/tvLocationTitle")
    WebElement center_location;
    @FindBy(id = "com.orko.all:id/btnContinue")
    WebElement continueBtn;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/androidx.cardview.widget.CardView/androidx.appcompat.widget.LinearLayoutCompat/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/androidx.appcompat.widget.LinearLayoutCompat/android.widget.RelativeLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.RadioButton[14]")
    WebElement ap_slot;
    @FindBy (id = "com.orko.all:id/btnNext")
    WebElement nextBtn;
    @FindBy( id = "com.orko.all:id/btnCallConfirm")
    WebElement confirm_ap;




    public WebElement click_on_appointment() {
        return appointment;
    }

    public WebElement click_on_select_patient(){
        return select_patient;
    }

    public WebElement click_on_center_location(){
        return center_location;
    }

    public WebElement click_on_continueBtn(){
        return continueBtn;
    }

    public WebElement click_on_ap_slot(){
        return ap_slot;
    }

    public WebElement click_on_nextBtn(){
        return nextBtn;
    }

    public WebElement click_on_confirm_ap(){
        return confirm_ap;
    }

}
