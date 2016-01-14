package core.browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by sergey on 1/14/16.
 */
public class ChromeUtils {
    public WebDriver driver;

    /**
     * @method Get browser
     * @return chromeBrowser
     */

    public ChromeUtils(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver_x64");
        this.driver = new ChromeDriver();
    }



    /**
     * Get ChromeBrowser
     * @return chromeBrowser
     */

//    update String UserAgent to another. WEB MOB start or something else
    public WebDriver getBrowser(String userAgent){
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--user-agent=" + userAgent);
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        capabilities.setCapability(ChromeOptions.CAPABILITY , chromeOptions);

        WebDriver driver = new ChromeDriver(capabilities);
        driver.manage().window().maximize();
        return driver;
    }


    /**
     * Get MobileChrome
     * @return
     */
    public WebDriver getMobileBrowser(){
        //Map for mobile emulation
        Map<String, String> mobileEmulation = new HashMap<String, String>();
        mobileEmulation.put("deviceName", "Google Nexus 5");

        //Map for option
        Map<String, Object> chromeOptions = new HashMap<String, Object>();
        chromeOptions.put("mobileEmulation", mobileEmulation);
        String [] argsLang = {"--lang=es"};
        chromeOptions.put("args", argsLang);
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        WebDriver driver = new ChromeDriver(capabilities);
        return driver;
    }
}
