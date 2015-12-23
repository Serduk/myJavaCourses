package pmHome.homeWorks.pmHomeWork5TestNG;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by serega on 23/12/15.
 */
public class RunRegistration {

    UserData ud = new UserData();

    ScreenShotUtils scrn = new ScreenShotUtils();

    @DataProvider(name = "dp")
    public Object[][] parseLocationData(){
        return new Object[][] {
                {"http://naughtyavenue.com"},
                {"http://getnaughty.com"}
        };
    }

    @BeforeTest
    public void setUpTest(){

        System.out.println("BeforeTest");



        }

    @BeforeMethod
    public void setUpMethod(){
        System.setProperty("webdriver.chrome.driver", "src/sources/chromedriver");

        //Map for mobile emulation
        Map<String, String> mobileEmulation = new HashMap<String, String>();
        mobileEmulation.put("deviceName", "Google Nexus 5");

        //Map for option
        Map<String, Object> chromeOptions = new HashMap<String, Object>();
        chromeOptions.put("mobileEmulation", mobileEmulation);
        String [] argsLang = {"--lang=es"};
        chromeOptions.put("args", argsLang);
    }

    DesiredCapabilities capabilities = DesiredCapabilities.chrome();
    WebDriver driver = new ChromeDriver(capabilities);
    MobIndexPage mib = new MobIndexPage(driver);

    @Test(dataProvider = "dp")
    public void testParseLocation(String domain){
        driver.get(domain);
        driver.manage().addCookie(new Cookie("ip_address", ud.UserLocationGBR));
        mib.signUpButton.click();
        mib.postCode.sendKeys("London");
        mib.validAge(5);
        mib.email.sendKeys(ud.getUserEmail());
        mib.password.sendKeys(ud.userPassword);

    }

    @AfterMethod
    public void methodDown(){
        driver.quit();
    }

    @AfterTest
    public void afterTest(){
        System.out.println("AfterMethod");
    }
}
