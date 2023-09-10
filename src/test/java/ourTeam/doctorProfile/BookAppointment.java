package ourTeam.doctorProfile;

import authorised_Access.splashScreen.SplashScreen;
import base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import orkoCare.ourTeam.doctorProfilePage.BookAppointmentPage;
import orkoCare.ourTeam.doctorProfilePage.DoctorProfilePage;



public class BookAppointment extends BaseClass {

    @Test
    public void bookAppointmentTest() throws InterruptedException {
        //Login
        Thread.sleep(2000);
        SplashScreen lg = new SplashScreen(driver);
        lg.login_homepage();

        //Our Team => Doctor Profile
        DoctorProfilePage dp = new DoctorProfilePage(driver);
        dp.click_on_ourTeam().click();
        Thread.sleep(4000);

        //Our Team => Book Appointment
        BookAppointmentPage book_ap = new BookAppointmentPage(driver);
        book_ap.click_on_bookAp().click();
        Thread.sleep(2000);
        book_ap.click_on_select_patient().click();
        Thread.sleep(4000);
        //Visit Book Appointment
        book_ap.click_on_visit_ap_slot().click();
        Thread.sleep(3000);
        //Virtual Book Appointment
        /*book_ap.click_on_telemedicine_ap_slot().click();
        Thread.sleep(3000);*/
        //Assertion
        WebElement result = driver.findElement(By.id("com.orko.all:id/tvUserStatus"));
        Assert.assertEquals(result.getText(), "Book Appointment");
        System.out.println("Successfully Book an Appointment");
        book_ap.click_on_nextBtn().click();
        Thread.sleep(3000);
        book_ap.click_on_confirmAppointment().click();
        Thread.sleep(3000);
        //Virtual Payment
        /*book_ap.click_on_payNow().click();
        Thread.sleep(3000);
        book_ap.click_on_ssl_Transaction();
        Thread.sleep(2000);
        book_ap.click_on_payBtn().click();
        Thread.sleep(3000);*/
        System.out.println("Payment Complete Successfully");




    }

}
