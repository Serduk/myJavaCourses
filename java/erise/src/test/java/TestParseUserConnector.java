package test.java;

import core.browser.ChromeUtils;
import core.browser.FireFoxUtils;
import dating.curlData.ParseUserData;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Created by sergey on 2/22/16.
 */
public class TestParseUserConnector {
    private WebDriver driver;


    private ParseUserData parseUserData;

    @BeforeClass
    public void setUp() {
//        FireFoxUtils chromeBrowser = new FireFoxUtils();
//        this.driver = chromeBrowser.getDriver();

        ChromeUtils chromeBrowser = new ChromeUtils("USA", 20);
        this.driver = chromeBrowser.getWebBrowser();


        this.parseUserData = new ParseUserData(this.driver);
    }

    @Test
    public void test() {
        driver.get("http://192.168.12.28/show/userData/?email=serduksergey90@gmail.com");
        System.out.println(parseUserData.getEmail() + " " + parseUserData.getSitename() + ", " + parseUserData.getGender());
    }

}
