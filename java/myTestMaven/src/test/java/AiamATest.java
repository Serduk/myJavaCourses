package test.java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

/**
 * Created by serega on 16/12/15.
 */


public class AiamATest {
    @Test
    public void test() throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://google.com.ua");

        GoogleSearchPage googleSearchPage = new GoogleSearchPage(driver);

        googleSearchPage.searchGoogle("Page Factory is amazing");
        Thread.sleep(3000);
        System.out.println("Fine");
        driver.quit();
    }
}
