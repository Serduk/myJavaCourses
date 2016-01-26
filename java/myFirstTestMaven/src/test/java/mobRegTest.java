package test.java;

import core.data.TrafficSourse;
import core.data.sitesData.SiteList;
import core.browser.ChromeUtils;
import core.screenShotUtils.ScreenShotUtils;
import dating.mob.pages.BaseFunnelPage;
import dating.mob.pages.BaseIndexPage;
import dating.mob.pages.BaseSearchPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
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

    String userEmail;


    @BeforeClass
    public void setup(){
        ChromeUtils chromeBrowser = new ChromeUtils("USA", 20);
        this.driver = chromeBrowser.getMobileBrowser();
    }

    @Test
    public void regTest() throws IOException {
        driver.get(siteList.getMobVersion() + siteList.getSitesArrayDating(0) + siteList.getDomainLive() + trafficSourse.getAffSourcre());
        BaseIndexPage index = new BaseIndexPage(this.driver);
        BaseFunnelPage funnel = new BaseFunnelPage(this.driver);
        BaseSearchPage searchPage = new BaseSearchPage(this.driver);
        index.fillRegistrationDataMans("London");
        userEmail = index.getUserEmail();
        index.submitRegForm();
//        takeScreen.getScreenShot(driver);
        funnel.funnelSkip();
        System.out.println("User Email is: " + userEmail);

        searchPage.clickOnMessageBtrn(1);
    }


//    @Test
//    public void goToMessenger() {
//        BaseFunnelPage funnel = new BaseFunnelPage(this.driver);
//        BaseSearchPage searchPage = new BaseSearchPage(this.driver);
//        funnel.funnelSkip();
//        System.out.println("User Email is: " + userEmail);
//
//        searchPage.clickOnMessageBtrn(1);
//    }
}
