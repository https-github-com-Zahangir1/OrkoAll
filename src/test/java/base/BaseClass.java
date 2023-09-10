package base;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class BaseClass {
    public static AndroidDriver driver;
    @BeforeClass
    public static AndroidDriver setup() {

        /*File f = new File("D:\\Apk\\Orko All.apk");
        File fs = new File(f, "Orko All.apk");*/

        //Emulator Device Set Capabilities
        /*DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11.0");
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel_3a_API_30");
        //cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel_3_API_30");
        cap.setCapability(MobileCapabilityType.UDID, "emulator-5554");
        cap.setCapability("appPackage", "com.orko.all");
        cap.setCapability("appActivity","com.orko.all.splash.SplashActivity");*/


        //Real Device Set Capabilities
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11.0");
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "SM G955F");
        cap.setCapability(MobileCapabilityType.UDID, "INZTGEC6NJPBDIWG");
        //cap.setCapability(MobileCapabilityType.UDID, "ce12171c9c5ed50c04");
        cap.setCapability("appPackage", "com.orko.all");
        cap.setCapability("appActivity","com.orko.all.splash.SplashActivity");



        // Appium server
        URL url = null;
        try {
            url = new URL("http://127.0.0.1:4723/wd/hub");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        assert url != null;

        driver = new AndroidDriver(url, cap);
        return driver;

    }

    @AfterClass
    public void tearDown() {
        driver.quit();
        System.out.println("Test Complete");
    }

}
