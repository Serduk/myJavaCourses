package core.browser;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;


import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * Created by sergey on 15.01.2016.
 *
 */
public class ChromeUtils {

    private int wait = 20;
    private DesiredCapabilities capabilities;
    public RemoteWebDriver driver;


    /**
     * @param location (Type : String, Site Location (ex. USA, GBR, ESP, etc.))
     */
    public ChromeUtils(String location, int wait){

        System.setProperty("webdriver.chrome.driver", "resources/chromedriver_x64");

        ChromeOptions options = new ChromeOptions();
        options.addArguments(setLanguage(location));

        this.capabilities = DesiredCapabilities.chrome();

        this.wait = wait;


    }

    /**
     * Browser Chrome;
     * Platform Web;
     * @return RemoteWebDriver;git b
     */
    public RemoteWebDriver getWebBrowser()
    {

        this.driver = new RemoteWebDriver(this.capabilities);
        this.driver.manage().window().maximize();
        this.driver.manage().timeouts().implicitlyWait(this.wait, TimeUnit.SECONDS);
        return this.driver;
    }

    /**
     * Browser Chrome;
     * Platform Mob;
     * @return RemoteWebDriver;
     */
    public RemoteWebDriver getMobileBrowser(){

        Map<String, String> mobileEmulation = new HashMap<String, String>();
        mobileEmulation.put("deviceName", "Google Nexus 5");

        Map<String, Object> chromeOptions = new HashMap<String, Object>();
        chromeOptions.put("mobileEmulation", mobileEmulation);

        this.capabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
        this.driver = new ChromeDriver(this.capabilities);
        this.driver.manage().timeouts().implicitlyWait(this.wait, TimeUnit.SECONDS);
        return this.driver;
    }

    /**
     * @param language String;
     * @return language String;
     */
//    @org.jetbrains.annotations.Contract(pure = true)
    private String setLanguage(String language) {

        switch (language)
        {
            case "USA":  language = "en-us";   break;
            case "AUS":  language = "en-au";   break;
            case "NZL":  language = "nl";      break;
            case "IRL":  language = "ga";      break;
            case "CAN":  language = "en-ca";   break;
            case "FRA":  language = "fr";      break;
            case "SPA":  language = "es";      break;
            case "ESP":  language = "es";      break;
            case "NOR":  language = "no";      break;
            case "DNK":  language = "da";      break;
            case "ITA":  language = "it";      break;
            case "SWE":  language = "sv";      break;
            case "SWI":  language = "de-ch";   break;
            case "GER":  language = "de";      break;
            default: language = "en";      break;
        }
        return language;
    }
}