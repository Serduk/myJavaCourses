package test.java;

import core.browser.ChromeUtils;
import core.browser.FireFoxUtils;
import core.screenShotUtils.ScreenShotUtils;
import dating.mob.pages.BaseIndexPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by sergey on 1/13/16.
 */
public class mobRegTest {

    private WebDriver driver;
    ScreenShotUtils takeScreen = new ScreenShotUtils();


    @BeforeTest
    public void setup(){
        ChromeUtils chromeBrowser = new ChromeUtils("USA", 15);
        this.driver = chromeBrowser.getMobileBrowser();
    }

    @Test
    public void regTest() throws IOException {
        driver.get("https://m.naughtyavenue.com");
        BaseIndexPage index = new BaseIndexPage(this.driver);
        index.fillRegistrationDataMans("London");
        index.submitRegForm();
        takeScreen.getScreenShot(driver);
    }

}
