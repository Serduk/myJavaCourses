package test.java;

import core.browser.ChromeUtils;
import core.csvUtils.WorkWithCSV;
import core.data.StaticDataWithTechnicalTask;
import core.data.TrafficSourse;
import core.data.sitesData.SiteList;
import core.locations.LocationData;
import core.screenShotUtils.ScreenShotUtils;
import dating.curlData.ParseUserData;
import dating.mob.pages.BaseFunnelPage;
import dating.mob.pages.BaseIndexPage;
import dating.mob.pages.BasePaymentPage;
import dating.mob.pages.BaseSearchPage;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import java.io.IOException;
import java.util.ArrayList;
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
    WorkWithCSV workWithCSV = new WorkWithCSV();

    /**
     * Initiation pages for tests
     * */
    private ParseUserData parseUserData;
    private BaseIndexPage index;
    private BaseFunnelPage funnel;
    private BaseSearchPage searchPage;
    private BasePaymentPage paymentPage;
    private List<String> userEmails = new ArrayList<String>();
    private String userMail;
    private String userPassword;
    private String shortID = "null";

    private String testName;
    private String userEmail;
    private String userLocation;
    private String userID;
    private String userSiteName;
    private  String userAutologin;

    @DataProvider(name = "dp")
    public Object[] [] parseLocaleData() {
        return new Object[][] {
                {"mynaughtydreams"},
                {"naughtyluck"},
                {"naughtyavenue"},
                {"shagtogether"}




//                {"naughtyavenue"},
//                {"mylustywish"},
//                {"mynaughtydreams"},
//                {"shagtogether"},
//                {"myfling"},
//                {"hookupsexy"},
//                {"naughtyluck"},
//                {"nastywish"},
//                {"getnaughty"},
//                {"blistyggnu"},
//                {"blivuartignu"},
//                {"blislem"},
//                {"soyezcoquin"},
//                {"flirtnu"},
//                {"flirtanu"},
//                {"finnemeg"},
//                {"rencardsexy"},
//                {"amourfinder"},
//                {"chatdatesex"},
//                {"myflinghub"}

//                {"flinghub"},
//                {"naughtyevents"}
        };
    }

    @BeforeTest
    public void setUp() {
//        driver = new FirefoxDriver();
        ChromeUtils chromeBrowser = new ChromeUtils("GBR", 20);
        this.driver = chromeBrowser.getMobileBrowser();

        /**
         * Initiation pages for test
         * */
        this.index = new BaseIndexPage(this.driver);
        this.funnel = new BaseFunnelPage(this.driver);
        this.searchPage = new BaseSearchPage(this.driver);
        this.parseUserData = new ParseUserData(this.driver);
    }

    @Test(dataProvider = "dp")
//    @Test
    public void testParseLocale(String domain) throws IOException {

//        String domain = "naughtyavenue";
        /**
         * Add Cookie
         * */
        driver.get(siteList.getMobVersion() + domain + siteList.getDomainLive() + trafficSourse.getToSetCookie());
        System.out.println("test " + domain);

        driver.manage().addCookie(new Cookie("ip_address", locationDatas[0].getIp()));

        /**
         * Reg User
         * */
        driver.get(siteList.getMobVersion() + domain + siteList.getDomainLive() + trafficSourse.getAffSourcre());

        System.out.println("Try fill reg form...");
        index.fillRegistrationDataMans("london");

        userMail = index.getUserEmail();
        userPassword = index.getUserPassword();
        System.out.println("user mail is: " +  userMail);


        userEmails.add(userMail);
        System.out.println("Try submit form...");
        index.submitRegForm();
        funnel.funnelSkip();

        System.out.println("array Size is " + userEmails.size());


        System.out.println("Try to get user data");
        driver.get(parseUserData.getUserData(userMail));
        testName = "DataUserRegTest";
        userEmail = parseUserData.getEmail();
        userLocation = parseUserData.getLocation();
        userID = parseUserData.getUserID();
        userSiteName = parseUserData.getSitename();
        userAutologin = parseUserData.getAutologinURL();


        System.out.println("Try save data to CSV");
        workWithCSV.saveInCSV(testName, userEmail, userLocation, userID, userSiteName, userAutologin);



//        data = driver.get("192.168.12.28/sync/?datingUser="+userMail);

    }

//    @Test(dependsOnMethods = {"testParseLocale"})
//    public void addDataToCSV() {
//        System.out.println("Try save user data...");
//        for (int i = 0; i < userEmails.size(); i++) {
//            parseUserData.getUserData(userEmails.get(i));
//
//            testName = "DataUserRegTest";
//            userEmail = parseUserData.getEmail();
//            userLocation = parseUserData.getLocation();
//            userID = parseUserData.getUserID();
//            userSiteName = parseUserData.getSitename();
//            userAutologin = parseUserData.getAutologinURL();
//
//
//            workWithCSV.saveInCSV(testName, userEmail, userLocation, userID, userSiteName, userAutologin);
//
//        }
//    }

    @AfterClass
    public void finishTest() {
        driver.quit();
    }
}
