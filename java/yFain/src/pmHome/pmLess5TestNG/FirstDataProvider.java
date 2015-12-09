package pmHome.pmLess5TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by serega on 09/12/15.
 */
public class FirstDataProvider {
    WebDriver driver;

    @DataProvider(name = "dp")
    public Object[] [] parseLocaleData() {
        return new Object[][] {
                {"https://www.upforit.com"},
                {"https://www.flirt.com"}
        };
    }

    @BeforeTest
    public void setUp() {
        driver = new FirefoxDriver();
    }

    @Test(dataProvider = "dp")
    public void testParseLocale(String domain) {
        driver.get(domain);
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}
