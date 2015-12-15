package pmHome.homeWorks.pmLess4PageObj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by serega on 02/12/15.
 */
public class LoginPageFirecams {
    public WebElement email;
    public WebElement pass;
    public WebElement loginButton;

    public LoginPageFirecams(WebDriver driver) {
        this.email = driver.findElement(By.xpath(".//*[@id='webCamSite\\models\\LoginFormWebCam_email']"));
        this.pass = driver.findElement(By.xpath(".//*[@id='webCamSite\\models\\LoginFormWebCam_password']"));
        this.loginButton = driver.findElement(By.xpath(".//*[@id='login_button']"));
    }
}
