package consultation;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Upcoming_Appointment_Page {

    AndroidDriver driver;

    public Upcoming_Appointment_Page(AndroidDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id ="com.orko.all:id/action_consultation")
    WebElement consultation;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.cardview.widget.CardView/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout")
    WebElement upcoming_appointment;
    @FindBy(id ="com.orko.all:id/ll_parent")
    WebElement patient_parent;


    public WebElement click_on_consultation(){
        return consultation;
    }

    public WebElement click_on_upcoming_appointment(){
        return upcoming_appointment;
    }

    public WebElement click_on_patient_parent(){
        return patient_parent;
    }



}
