package utilities;

import io.appium.java_client.android.AndroidDriver;
import java.time.Duration;

public interface Utility {

    default void implicitWait(AndroidDriver driver) {
            // Implicit wait
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
            //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        }

}
