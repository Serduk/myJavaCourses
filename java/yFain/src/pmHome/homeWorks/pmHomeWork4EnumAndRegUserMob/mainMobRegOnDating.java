package pmHome.homeWorks.pmHomeWork4EnumAndRegUserMob;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;
import pmHome.homeWorks.pmHomeWork3RegDating.PopUps;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by serega on 08/12/15.
 */
public class mainMobRegOnDating {
    public static void main(String[] args) throws InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver", "src/sources/chromedriver");

        //Map for monile emulation
        HashMap<String, String> mobileEmulation = new HashMap<String, String>();
        mobileEmulation.put("deviceName", "Google Nexus 5");

        //Map for chrome options
        Map<String, Object> chromeOptions = new HashMap<String, Object>();
        chromeOptions.put("mobileEmulation", mobileEmulation);
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        capabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);

        //Start driver

        LocationData[] locationDatas = LocationData.values();
        for (int i = 0; i < locationDatas.length; i++) {
        WebDriver dr = new ChromeDriver(capabilities);
        UserData ud = new UserData();
        ScreenShotUtils scr = new ScreenShotUtils();

        System.out.println(locationDatas[i].getIp() + " " + locationDatas[i].getCity());

        dr.get(ud.site + ud.toSetCookie);
        dr.manage().addCookie(new Cookie("ip_address", locationDatas[i].getIp()));
        System.out.println("Cookie is " + dr.manage().getCookies());
        dr.get(ud.site + ud.sourceAff);

        MobIndexPage indexPage = new MobIndexPage(dr);

        indexPage.signUpButton.click();
        indexPage.postCode.sendKeys(locationDatas[i].getCity());
        Select day = new Select(indexPage.birthDay);
        day.selectByIndex(ud.setDatareg);
        Select month = new Select(indexPage.birthMonth);
        month.selectByIndex(ud.setDatareg);
        Select year = new Select(indexPage.birthYear);
        year.selectByIndex(ud.setDatareg);
        indexPage.email.sendKeys(ud.getUserEmail());
        Thread.sleep(3000);

        indexPage.submitForm.submit();

        System.out.println("My current email: " + ud.userEmail + "\n" + "Password: " + ud.userPassword);

        while (true) {
            int totalWait = 0;
            Thread.sleep(3000);
            if (!(dr.getCurrentUrl().equals(ud.site + ud.sourceAff))) {
                System.out.println("Registration is Complited. Total wait = " + totalWait);
                break;
            }
            totalWait++;

            if (totalWait > 10) {
                System.out.println("Site is Down");
                break;
            }
        }

        scr.takeScreenShot(dr);
        dr.quit();

        }



    }
}
