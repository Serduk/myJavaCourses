package test.java;

import core.data.TrafficSourse;
import core.data.sitesData.SiteList;
import core.browser.ChromeUtils;
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
    SiteList siteList = new SiteList();
    TrafficSourse trafficSourse = new TrafficSourse();


    @BeforeTest
    public void setup(){
        ChromeUtils chromeBrowser = new ChromeUtils("USA", 15);
        this.driver = chromeBrowser.getMobileBrowser();
    }

    @Test
    public void regTest() throws IOException {
        driver.get(siteList.getMobVersion() + siteList.getSitesArrayDating(0) + siteList.getDomainLive() + trafficSourse.getAffSourcre());
        BaseIndexPage index = new BaseIndexPage(this.driver);
        index.fillRegistrationDataMans("London");
        index.submitRegForm();
        takeScreen.getScreenShot(driver);
    }

}
