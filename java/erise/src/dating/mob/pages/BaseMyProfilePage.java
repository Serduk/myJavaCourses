package dating.mob.pages;

import core.browser.AbstractWebPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by sergey on 2/2/16.
 */
public class BaseMyProfilePage extends AbstractWebPage{
    public BaseMyProfilePage(WebDriver driver) {
        super(driver);
    }

    /**
     * @Elements on MyprofilePage
     * Describe all elements on /profile
     * */

    @FindBy(xpath = ".//*[@class='tbr-button tbr-button-setting']")
    public WebElement settingBtn;




    /***********************METHODS***************************/

    /**
     * Methods for myProfilePage
     * */
}
