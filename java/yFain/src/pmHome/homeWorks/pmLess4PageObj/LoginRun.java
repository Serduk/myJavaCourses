package pmHome.homeWorks.pmLess4PageObj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.IOException;

/**
 * Created by serega on 02/12/15.
 */
public class LoginRun {
    public static void main(String[] args) throws IOException {
        WebDriver dr = new FirefoxDriver();
        ScreenShotUtils scr = new ScreenShotUtils();

        String site = "http://www.firecams.com/site/login";



        dr.get(site);
        PopUpS popUp = new PopUpS(dr);
        LoginPageFirecams loginPage = new LoginPageFirecams(dr);

        popUp.confirmAgeNotRegisteredUser.click();
        loginPage.email.sendKeys("agjhgjhg7755sf@aol.com");
        loginPage.pass.sendKeys("123123");
        loginPage.loginButton.click();
        scr.takeScreenShot(dr);
        dr.quit();


    }
}
