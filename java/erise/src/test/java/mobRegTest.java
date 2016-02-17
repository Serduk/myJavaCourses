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
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;


/**
 * Created by sergey on 1/13/16.
 */

/**
 * @TODO: add check all redirects to pp at first. login logout etc.
 * */

public class mobRegTest {

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
    private BaseFunnelPage funnel;


    /**
     * Create dif fields for test
     * */
    String userEmail;
    int countUserInSearch;
    String currentSiteTest;
    String userPassword = "";
    String shortID = "";



    @BeforeClass
    public void setup(){
        ChromeUtils chromeBrowser = new ChromeUtils("USA", 20);
        this.driver = chromeBrowser.getMobileBrowser();

        /**
         * Initiation pages for test
         * */
        this.index = new BaseIndexPage(this.driver);
        this.funnel = new BaseFunnelPage(this.driver);
        this.searchPage = new BaseSearchPage(this.driver);
        this.paymentPage = new BasePaymentPage(this.driver);
    }

    @BeforeMethod
    public void refreshPage(){
        driver.navigate().refresh();
    }


    @Test
    public void addCookie() {
        driver.get(siteList.getMobVersion() + siteList.getSitesArrayDating(0) + siteList.getDomainLive() + trafficSourse.getToSetCookie());
        driver.manage().addCookie(new Cookie("ip_address", locationDatas[2].getIp()));

    }

    @Test(dependsOnMethods = {"addCookie"})//(priority = 1)
    public void regTest() {
        driver.get(siteList.getMobVersion() + siteList.getSitesArrayDating(0) + siteList.getDomainLive() + trafficSourse.getAffSourcre());
        index.fillRegistrationDataMans("London");
        userEmail = index.getUserEmail();
        userPassword = index.getUserPassword();
        index.submitRegForm();
        System.out.println("User Email is: " + userEmail);
//        takeScreen.getScreenShot(driver);
    }


    @Test(dependsOnMethods = {"regTest"})
    public void skipFunnel() {
        funnel.funnelSkip();
    }

    /**
     * Check count users in search
     * */
    @Test(dependsOnMethods = {"skipFunnel"})
    public void checkSearch() {
        countUserInSearch = searchPage.userListInSearch.size();
        System.out.println(countUserInSearch);
        Assert.assertEquals(countUserInSearch, staticData.PROFILES_IN_SEARCH_FOR_FREE_USER);
    }

    /**
     * TestUser send 5free message to diff profile
     * */
    @Test(dependsOnMethods = {"checkSearch"})
    public void checkFiveFreeMessage(){
        searchPage.sendFiveFreeMessageDiffUsers(staticData.getGreetings());
    }

//    @Test(dependsOnMethods = {"checkFiveFreeMessage"})
//    public void checkRedirectoToPPWithSixMessage(){
//        searchPage.writeMessage(10, staticData.getGreetings());
//        Assert.assertTrue(paymentPage.paymentDataForm.isDisplayed());
//    }

    @Test(dependsOnMethods = {"regTest"})
    public void saveDataToCSV() throws IOException {

        workWithCSV.saveInCSV("sadfa", userEmail, userPassword, shortID);
        workWithCSV.getEmailColumm();
    }

    @AfterClass
    public void closeBrowser() {
        driver.quit();
    }
}
