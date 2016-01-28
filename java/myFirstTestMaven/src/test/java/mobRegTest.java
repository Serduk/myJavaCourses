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
    StaticDataWithTechnicalTask staticData = new StaticDataWithTechnicalTask();
    LocationData[] locationDatas = LocationData.values();
    WorkWithCSV workWithCSV = new WorkWithCSV();


    String userEmail;
    int countUserInSearch;


    @BeforeClass
    public void setup(){
        ChromeUtils chromeBrowser = new ChromeUtils("USA", 20);
        this.driver = chromeBrowser.getMobileBrowser();
    }

    @Test
    public void addCookie() {
        driver.get(siteList.getMobVersion() + siteList.getSitesArrayDating(0) + siteList.getDomainLive() + trafficSourse.getToSetCookie());
        driver.manage().addCookie(new Cookie("ip_address", locationDatas[2].getIp()));

    }

    @Test(dependsOnMethods = {"addCookie"})//(priority = 1)
    public void regTest() {
        driver.get(siteList.getMobVersion() + siteList.getSitesArrayDating(0) + siteList.getDomainLive() + trafficSourse.getAffSourcre());
        BaseIndexPage index = new BaseIndexPage(this.driver);
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

    /**
     * Check count users in search
     * */
    @Test(dependsOnMethods = {"skipFunnel"})
    public void checkSearch() {
        BaseSearchPage searchPage = new BaseSearchPage(this.driver);
        countUserInSearch = searchPage.userListInSearch.size();
        System.out.println(countUserInSearch);
        Assert.assertEquals(countUserInSearch, staticData.PROFILES_IN_SEARCH_FOR_FREE_USER);
    }

    /**
     * TestUser send 5free message to diff profile
     * */
    @Test(dependsOnMethods = {"checkSearch"})
    public void checkFiveFreeMessage(){
        BaseSearchPage searchPage = new BaseSearchPage(this.driver);
        searchPage.sendFiveFreeMessageDiffUsers(staticData.getGreetings());
    }

    @Test(dependsOnMethods = {"checkFiveFreeMessage"})
    public void checkRedirectoToPPWithSixMessage(){
        BaseSearchPage searchPage = new BaseSearchPage(this.driver);
        BasePaymentPage paymentPage = new BasePaymentPage(this.driver);
        searchPage.writeMessage(10, staticData.getGreetings());
        Assert.assertTrue(paymentPage.paymentDataForm.isDisplayed());
    }

    @Test(dependsOnMethods = {"regTest"})
    public void saveDataToCSV(){

        workWithCSV.saveInCSV(userEmail);
    }

}
