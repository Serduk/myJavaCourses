package dating.mob.pages;

import core.browser.AbstractWebPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by sergey on 2/2/16.
 */
public class BaseMyAccountPage extends AbstractWebPage{
    public BaseMyAccountPage(WebDriver driver) {
        super(driver);
    }

    /**
     * @Elements all elements
     * Describe all elements
     * */

    /*
    add bellow:
    * Status user
    * User ID
    * */

    @FindBy(xpath = ".//*[@data-role='upgrade-button']")
    public WebElement getFullMembershipBtn;

    /*Change language dropBox*/
    @FindBy(xpath = ".//*[@id='profileLanguageSelect']")
    WebElement changeLanguageSettingsDrop;
    public Select languageSelector(){
        return new Select(changeLanguageSettingsDrop);
    }

    @FindBy(xpath = ".//*[@data-page='accountChangePassword']")
    public WebElement changePasswordBtn;

    @FindBy(xpath = ".//*[@data-page='accountChangeEmail']")
    public WebElement changeEmailBtn;

    @FindBy(xpath = ".//*[@data-page='accountEmailNotifications']")
    public WebElement emailSettingsBtn;

    @FindBy(xpath = ".//*[@href='/site/logout']")
    public WebElement logoutBtn;







    /*******************METHODS********************/

    /**
     * @Methods
     * Describe all methods
     * */
}
