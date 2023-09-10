package orkoCare.ourTeam.doctorProfilePage;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class BookAppointmentPage {

    AndroidDriver driver;

    public BookAppointmentPage(AndroidDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }


    @FindBy(id = "com.orko.all:id/chipBookAppointment")
    WebElement bookAp;
    @FindBy(id = "com.orko.all:id/ll_parent")
    WebElement select_patient;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/androidx.cardview.widget.CardView/androidx.appcompat.widget.LinearLayoutCompat/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/androidx.appcompat.widget.LinearLayoutCompat/android.widget.RelativeLayout[2]/android.widget.LinearLayout/android.view.ViewGroup/android.widget.RadioButton[1]")
    WebElement select_visit_ap_slot;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/androidx.cardview.widget.CardView/androidx.appcompat.widget.LinearLayoutCompat/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/androidx.appcompat.widget.LinearLayoutCompat/android.widget.RelativeLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.RadioButton[1]")
    WebElement select_virtual_ap_slot;
    @FindBy(id = "com.orko.all:id/btnNext")
    WebElement nextBtn;
    @FindBy(id ="com.orko.all:id/btnCallConfirm")
    WebElement confirmAppointment;
    @FindBy(id ="com.orko.all:id/btnPayNow")
    WebElement payNow;
    @FindBy(id ="com.orko.all:id/selectedContentArea")
    WebElement ssl_Transaction;
    @FindBy(id ="com.orko.all:id/layout_pay")
    WebElement payBtn;





    public WebElement click_on_bookAp(){
        return bookAp;
    }

    public WebElement click_on_select_patient(){
        return select_patient;
    }

    public WebElement click_on_visit_ap_slot(){
        return select_visit_ap_slot;
    }

    public WebElement click_on_telemedicine_ap_slot(){
        return select_virtual_ap_slot;
    }

    public WebElement click_on_nextBtn(){
        return nextBtn;
    }

    public WebElement click_on_confirmAppointment(){
        return confirmAppointment;
    }

    public WebElement click_on_payNow(){
        return payNow;
    }

    public WebElement click_on_ssl_Transaction() {
        /*for (int i = 1; i <= 2; i++){
            System.out.println("Double Click");
        }*/
            return ssl_Transaction;
    }

    public WebElement click_on_payBtn(){
        return payBtn;
    }






}
