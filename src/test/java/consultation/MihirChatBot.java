package consultation;

import authorised_Access.splashScreen.SplashScreen;
import base.BaseClass;
import org.testng.annotations.Test;

public class MihirChatBot extends BaseClass {

    @Test
    public void mihirChatBot_Test() throws InterruptedException {
        //Login
        Thread.sleep(2000);
        SplashScreen lg = new SplashScreen(driver);
        lg.login_homepage();

        //Mihir Chat Bot
        MihirChatBot_Page _bot = new MihirChatBot_Page(driver);
        _bot.click_on_consultation().click();
        Thread.sleep(2000);
        _bot.click_on_chatBot().click();
        Thread.sleep(2000);
        _bot.click_on_callLayout().click();
        Thread.sleep(2000);
        _bot.click_on_search_help().click();
        Thread.sleep(4000);




    }

}
