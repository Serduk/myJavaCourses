package test.java.myFirstSeleniumServerStandalone;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * Created by serega on 23/12/15.
 */
public class DataProvTest {
    @DataProvider(name = "dp", parallel = true)
    public Object[][] parseLocation(){
        return new Object[][]{
                {"https://www.upforit.com"},
                {"https://www.flirt.com"},
                {"https://www.upforit.com"},
                {"https://www.upforit.com"}
        };

    }


    @Test(dataProvider = "dp")
    public void testParseLocale(String domain) throws MalformedURLException, InterruptedException {
        DesiredCapabilities capability = DesiredCapabilities.firefox();
        WebDriver driver = new RemoteWebDriver(new URL("http://127.0.0.1:4444/wd/hub"), capability);

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get(domain);
        Thread.sleep(5000);
        driver.quit();
    }
}
