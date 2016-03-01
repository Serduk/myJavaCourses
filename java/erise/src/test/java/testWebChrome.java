package test.java;

import core.browser.ChromeUtils;
import core.csvUtils.WorkWithCSV;
import core.data.StaticDataWithTechnicalTask;
import core.data.TrafficSourse;
import core.data.sitesData.SiteList;
import core.locations.LocationData;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Created by sergey on 3/1/16.
 */
public class testWebChrome {

    private WebDriver driver;
    SiteList siteList = new SiteList();
    TrafficSourse trafficSourse = new TrafficSourse();
    StaticDataWithTechnicalTask staticData = new StaticDataWithTechnicalTask();
    LocationData[] locationDatas = LocationData.values();
    WorkWithCSV workWithCSV = new WorkWithCSV();

    @BeforeClass
    public void setup() {
        ChromeUtils chromeBrowser = new ChromeUtils("USA", 20);
        this.driver = chromeBrowser.getWebBrowser();
    }

    @Test
    public void test() {
        driver.get("https://google.com");
    }

}
