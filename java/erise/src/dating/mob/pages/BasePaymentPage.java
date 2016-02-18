package dating.mob.pages;

import core.browser.AbstractWebPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by sergey on 1/27/16.
 */
public class BasePaymentPage extends AbstractWebPage{
    public BasePaymentPage(WebDriver driver) {
        super(driver);
    }

    /**
     * Describe all elements on page
     * */

    @FindBy(xpath = ".//*[@class='pay-data-box  has-arrows']")
    public WebElement paymentDataForm;
}
