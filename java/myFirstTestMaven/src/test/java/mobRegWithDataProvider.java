package test.java;

import core.csvUtils.WorkWithCSV;
import core.data.StaticDataWithTechnicalTask;
import core.data.TrafficSourse;
import core.data.sitesData.SiteList;
import core.browser.ChromeUtils;
import core.locations.LocationData;
import core.screenShotUtils.ScreenShotUtils;
import dating.mob.pages.BaseFunnelPage;
import dating.mob.pages.BaseIndexPage;
import dating.mob.pages.BasePaymentPage;
import dating.mob.pages.BaseSearchPage;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by sergey on 1/13/16.
 */
public class mobRegWithDataProvider {

    /**
     * Initiation class for tests
     * */
    private WebDriver driver;
    ScreenShotUtils takeScreen = new ScreenShotUtils();
    SiteList siteList = new SiteList();
    TrafficSourse trafficSourse = new TrafficSourse();
    StaticDataWithTechnicalTask staticData = new StaticDataWithTechnicalTask();
    LocationData[] locationDatas = LocationData.values();
    WorkWithCSV workWithCSV = new WorkWithCSV();

    /**
     * Initiation pages for tests
     * */
    private BaseIndexPage index;
    private BaseSearchPage searchPage;
    private BasePaymentPage paymentPage;


    /**
     * Create dif fields for test
     * */
    String userEmail;
    int countUserInSearch;
    String currentSiteTest;


    @DataProvider(name = "dp")
    public Object[][] parseLocaleData(){
        return new Object[][]{
                {"https://m.naughtyavenue.com"},
                {"https://m.mynaughtydreams.com"}
        };
    }



    @BeforeClass
    public void setup(){
        ChromeUtils chromeBrowser = new ChromeUtils("USA", 20);
        this.driver = chromeBrowser.getMobileBrowser();

        /**
         * Initiation pages for test
         * */
        this.index = new BaseIndexPage(this.driver);
        this.searchPage = new BaseSearchPage(this.driver);
        this.paymentPage = new BasePaymentPage(this.driver);
    }


    @Test(dataProvider = "dp")
    public void addCookie(String domain) {
//        driver.get(siteList.getMobVersion() + siteList.getSitesArrayDating(0) + siteList.getDomainLive() + trafficSourse.getToSetCookie());
        currentSiteTest = domain;
        driver.get(currentSiteTest + trafficSourse.getToSetCookie());
        driver.manage().addCookie(new Cookie("ip_address", locationDatas[2].getIp()));
    }

    @Test(dataProvider = "dp", dependsOnMethods = {"addCookie"})//(priority = 1)
    public void regTest() {
//        driver.get(siteList.getMobVersion() + siteList.getSitesArrayDating(0) + siteList.getDomainLive() + trafficSourse.getAffSourcre());
        driver.get(currentSiteTest + trafficSourse.getAffSourcre());
        index.fillRegistrationDataMans("London");
        userEmail = index.getUserEmail();
        index.submitRegForm();
        System.out.println("User Email is: " + userEmail);
//        takeScreen.getScreenShot(driver);
    }


    @Test(dependsOnMethods = {"regTest"})
    public void skipFunnel() {
        BaseFunnelPage funnel = new BaseFunnelPage(this.driver);
        funnel.funnelSkip();
    }

}
