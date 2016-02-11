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
import org.testng.annotations.*;

import java.io.IOException;
import java.util.List;

/**
 * Created by sergey on 1/13/16.
 */
public class mobRegWithDataProvider {

    /**
     * Initiation class for tests
     * */
    private WebDriver driver;
    ScreenShotUtils takeScreen = new ScreenShotUtils();
    TrafficSourse trafficSourse = new TrafficSourse();
    StaticDataWithTechnicalTask staticData = new StaticDataWithTechnicalTask();
    LocationData[] locationDatas = LocationData.values();
    SiteList siteList = new SiteList();

    /**
     * Initiation pages for tests
     * */
    private BaseIndexPage index;
    private BaseSearchPage searchPage;
    private BasePaymentPage paymentPage;
    private List<String> userEmails;


    /**
     * Create dif fields for test
     * */
    String userEmail;
    int countUserInSearch;
    String currentSiteTest;


    @DataProvider(name = "dp")
    public Object[][] parseLocaleData(){
        return new Object[][]{
                {"naughtyavenue"},
                {"mylustywish"},
                {"mynaughtydreams"},
                {"shagtogether"},
                {"flinghub"},
                {"naughtyevents"},
                {"myfling"},
                {"hookupsexy"},
                {"naughtyluck"},
                {"nastywish"},
                {"getnaughty"},
                {"blistyggnu"},
                {"blivuartignu"},
                {"blislem"},
                {"soyezcoquin"},
                {"flirtnu"},
                {"flirtanu"},
                {"finnemeg"},
                {"rencardsexy"},
                {"amourfinder"},
                {"chatdatesex"},
                {"myflinghub"}

/*                {"https://m.naughtyavenue.com"},
                {"https://m.mylustywish.com"},
                {"https://m.mynaughtydreams.com"},
                {"https://m.shagtogether.com"},
                {"https://m.flinghub.com"},
                {"https://m.naughtyevents.com"},
                {"https://m.myfling.com"},
                {"https://m.hookupsexy.com"},
                {"https://m.naughtyluck.com"},
                {"https://m.nastywish.com"},
                {"https://m.getnaughty.com"},
                {"https://m.blistyggnu.com"},
                {"https://m.blivuartignu.com"},
                {"https://m.blislem.com"},
                {"https://m.soyezcoquin.com"},
                {"https://m.flirtnu.com"},
                {"https://m.flirtanu.com"},
                {"https://m.finnemeg.com"},
                {"https://m.rencardsexy.com"},
                {"https://m.amourfinder.com"},
                {"https://m.chatdatesex.com"},
                {"https://m.myflinghub.com"}*/
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
    }


    @Test(dataProvider = "dp")
    public void regUser(String domain) {
        /**
         * Add Cookie
         * */
        currentSiteTest = domain; //driver.getCurrentUrl();
        System.out.println(currentSiteTest);
        driver.get(siteList.getMobVersion() + currentSiteTest + siteList.getDomainLive() + trafficSourse.getToSetCookie());
        driver.manage().addCookie(new Cookie("ip_address", locationDatas[2].getIp()));

        /**
         * Reg User
         * */
        driver.get(siteList.getMobVersion() + currentSiteTest + siteList.getDomainLive() + trafficSourse.getAffSourcre());
        index.goToSignUpPage();
        index.fillRegistrationDataMans("london");


        userEmails.add(index.getUserEmail());


        index.submitRegForm();
    }

    @AfterTest
    public void getListEmails() {
        userEmails.size();
        userEmails.listIterator();
        userEmails.iterator();
        driver.quit();
    }

}
