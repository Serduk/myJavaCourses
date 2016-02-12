package test.java;

import core.browser.ChromeUtils;
import core.data.StaticDataWithTechnicalTask;
import core.data.TrafficSourse;
import core.data.sitesData.SiteList;
import core.locations.LocationData;
import core.screenShotUtils.ScreenShotUtils;
import dating.mob.pages.BaseFunnelPage;
import dating.mob.pages.BaseIndexPage;
import dating.mob.pages.BasePaymentPage;
import dating.mob.pages.BaseSearchPage;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.List;

/**
 * Created by sergey on 2/12/16.
 */
public class RegistrationDataProvider {
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
    private BaseFunnelPage funnel;
    private BaseSearchPage searchPage;
    private BasePaymentPage paymentPage;
    private List<String> userEmails;

    @DataProvider(name = "dp")
    public Object[] [] parseLocaleData() {
        return new Object[][] {
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
        };
    }

    @BeforeTest
    public void setUp() {
//        driver = new FirefoxDriver();
        ChromeUtils chromeBrowser = new ChromeUtils("USA", 20);
        this.driver = chromeBrowser.getMobileBrowser();

        /**
         * Initiation pages for test
         * */
        this.index = new BaseIndexPage(this.driver);
        this.funnel = new BaseFunnelPage(this.driver);
        this.searchPage = new BaseSearchPage(this.driver);
    }

    @Test(dataProvider = "dp")
    public void testParseLocale(String domain) {
//        driver.get(domain);
        /**
         * Add Cookie
         * */
        driver.get(siteList.getMobVersion() + domain + siteList.getDomainLive() + trafficSourse.getToSetCookie());
        System.out.println("test " + domain);

        driver.manage().addCookie(new Cookie("ip_address", locationDatas[2].getIp()));

        /**
         * Reg User
         * */
        driver.get(siteList.getMobVersion() + domain + siteList.getDomainLive() + trafficSourse.getAffSourcre());

//        index.goToSignUpPage();
        index.fillRegistrationDataMans("london");
        userEmails.add(index.getUserEmail());
        index.submitRegForm();
        funnel.funnelSkip();

    }
}
