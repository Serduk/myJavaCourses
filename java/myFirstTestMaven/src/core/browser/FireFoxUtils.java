package core.browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by sergey on 1/13/16.
 */
public class FireFoxUtils {
    public  WebDriver driver;

    /**
     * @mehtod getBrowser
     * @return FirefoxBrowser
     */

    public FireFoxUtils () {
        this.driver = new FirefoxDriver();
    }

    public WebDriver getDriver() {
        return driver;
    }
}
