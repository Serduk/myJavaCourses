package test.java;

import core.data.TrafficSourse;
import core.data.sitesData.SiteList;
import core.locations.LocationData;
import core.screenShotUtils.ScreenShotUtils;
import dating.mob.pages.BaseIndexPage;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by sergey on 3/2/16.
 */

/*
* Task: https://jira.togethernetworks.com/browse/AG-1080
* */


public class TermsTranslationTest {
    private WebDriver driver;
    private ScreenShotUtils screenShot = new ScreenShotUtils();
    private TrafficSourse trafficSourse = new TrafficSourse();
    private LocationData[] locationDatas = LocationData.values();
    private SiteList siteList = new SiteList();

    private String termsPage = "/staticPage/terms";
    private String textForCheckingFirst = "Users that have purchased full membeship can send and reply to messages, check all search results, view full-size photos, check full profile info, contact popular members";
    private String textForCheckingSecond = "For Premium SMS Billing Users (Australia only), Customer Helpline 1800836188 (Data fees may apply). To Unsubscribe, SMS STOP to 19900107 or call our Customer Helpline at 1800836188.";
    private String textForCheckintThird = "Please review the payment page very carefully when you come to make payment, if you do it for the first time on our sites. We will charge your credit card. Please note that all payments made by you are not refundable.";
    private String textForCheckingFourth = "Please be aware that when you subscribe to any package, including the trial period, you will become liable for automatic renewal billing. Thereby you acknowledge that your subscription has an initial and recurring payment feature and accept responsibility for all recurring charges prior to cancellation.";


//    private WebElement termsText = driver.findElement(By.xpath(".//*[@class = 'page-centerer']"));


    @DataProvider(name = "dp")
    public Object[] [] parseLocaleData() {
        return new Object[][] {
                {"mynaughtydreams"},
                {"naughtyluck"},
                {"naughtyavenue"},
                {"shagtogether"},
                {"naughtyavenue"},
                {"mylustywish"},
                {"mynaughtydreams"},
                {"shagtogether"},
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
                {"myflinghub"},
                {"flinghub"},
                {"naughtyevents"}
        };
    }

    @BeforeTest
    public void setUp() {
        driver = new FirefoxDriver();

    }

    @Test(dataProvider = "dp")
    public void startTest(String domain) throws InterruptedException, IOException {
        /**
         * Add Cookie
         * */
        driver.get(siteList.getWebVersion() + domain + siteList.getDomainLive() + trafficSourse.getToSetCookie());
        System.out.println("test " + domain);

        driver.manage().addCookie(new Cookie("ip_address", locationDatas[0].getIp()));

        /**
         * Check terms
         * */
        driver.get(siteList.getWebVersion() + domain +siteList.getDomainLive() + termsPage);
        System.out.println("check text on page");
//        Assert.assertEquals(termsText.findElement(By.partialLinkText(textForCheckingFirst)), textForCheckingFirst);
        Thread.sleep(3000);
        screenShot.getScreenShot(driver);
        System.out.println("screen shot take...");
    }

}
