package dating.mob.pages;

import core.browser.AbstractWebPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by sergey on 2/24/16.
 */
public class BasePaymentPage extends AbstractWebPage {
    public BasePaymentPage(WebDriver driver) {
        super(driver);
    }

    /**
     * DESCRIBE ALL ELEMENTS ON PAGE
     * */
    /****************************************************CHOSE PACKAGE TYPE PAGE***********************************************/
    @FindBy(xpath = ".//*[@class='pay-data-box  has-arrows']")
    public WebElement paymentDataForm;

    @FindBy(xpath = ".//*[@id='toolbarBack']")
    WebElement iDoItLaterBtn;

    @FindBy(xpath = ".//div[@data-pay-package = '3DAY1']")
    WebElement packageTypeThreeDay;

    @FindBy(xpath = ".//div[@data-pay-package = '28DAY1']")
    WebElement packageTypeOneMonth;

    @FindBy(xpath = ".//div[@data-pay-package = '84DAY1']")
    WebElement packageTypeThreeMonths;

    @FindBy(xpath = ".//div[@data-pay-package = '168DAY1']")
    WebElement packageTypeSixMonths;

    @FindBy(xpath = ".//*[@id = 'continueButton']")
    WebElement continueBtn;

    @FindBy(xpath = ".//div[@class = 'b-checkbox']")
    WebElement subscribeXXXvideosCheckBox;

    @FindBy(xpath = ".//a[@href = '/pay/page/billingpolicy']")
    WebElement billingPolicyHref;

    @FindBy(xpath = ".//span[@class = 'hotline']")
    WebElement hotlineNumverText;

    @FindBy(xpath = ".//a[contains(@href, 'pay/page/requirementsComplianceStatement')]")
    WebElement requirementsComplianceStatementHref;

    @FindBy(xpath = ".//span[@class = 'info']")
    WebElement copyrigtsText;



    /***************************************DESCRIBE CARD FORM PAGE*********************************/
    @FindBy(xpath = ".//*[@class = 'field-inner']")
    WebElement cardNumberField;

    @FindBy(xpath = ".//select[@name = 'CreditCardPaymentForm[expiration_date_m]']")
    WebElement monthExpiraton;
    public Select monthExpirationSelect() {
        return new Select(monthExpiraton);
    }

    @FindBy(xpath = ".//select[@name = 'CreditCardPaymentForm[expiration_date_y]']")
    WebElement yearExpiration;
    public Select yearExpirationSelect() {
        return new Select(yearExpiration);
    }

    @FindBy(xpath = ".//*[@name = 'CreditCardPaymentForm[security_number]']")
    WebElement cvvField;

    @FindBy(xpath = ".//*[@name = 'CreditCardPaymentForm[card_holder]']")
    WebElement cardHolderNameField;

    @FindBy(xpath = ".//*[@class = 'pay-button']")
    WebElement payNowBTN;

    /****************POSTRANS FEATURE DESCRIBE PAGE**************************/
    @FindBy(xpath = ".//*[@data-pay-package = '28DAY5']")
    WebElement fullFeatureUpgrade;

    @FindBy(xpath = ".//*[@data-pay-package = '28DAY7']")
    WebElement searchFeatureUpgrade;

    @FindBy(xpath = ".//*[@data-pay-package = '28DAY2']")
    WebElement communicationFeatureUpgrade;

    @FindBy(xpath = ".//*[@class = 'continue']")
    WebElement continueFromFeatureBtn;

    /*******************POSTRANS CREDITS DESCRIBE PAGE*************************/
    @FindBy(xpath = ".//*[@id = 'package_600']")
    WebElement thirtyFiveCreditsBuy;

    @FindBy(xpath = ".//*[@id = 'package_601']")
    WebElement sevethyFiveCreditsBuy;

    @FindBy(xpath = ".//*[@id = 'cardDetailsSubmit']")
    WebElement buyCreditsBtn;

    @FindBy(xpath = ".//*[@class = 'pay-button-cancel']")
    WebElement notBuyCredtisBtn;

    /*************************PAYMENT IS CUCCESSFUL PAGE*************************/
    @FindBy(xpath = ".//*[@id = 'back_site_button']")
    WebElement backToTheSiteBtn;

    /*************************DECLINE PAGE***********************************/
    @FindBy(xpath = ".//*[@data-decline-tab = 'pp-instructions']")
    WebElement declineInstructionForm;

    @FindBy(xpath = ".//*[@data-decline-tab = 'pp-form']")
    WebElement declinePaymentForm;

    @FindBy(xpath = ".//*[@data-decline-tab = 'pp-callback']")
    WebElement declineCallBackForm;

    @FindBy(xpath = ".//*[@class = 'support-btn']")
    WebElement declineInstructionFormHelpLineChat;

    @FindBy(xpath = ".//*[@id = 'callMeBackButton']")
    WebElement declineInstructionFormCalMeBackBtn;

    @FindBy(xpath = ".//*[@id = 'callMeBackFullPrefix']")
    WebElement declineCallMeBackInputPrefixFild;

    @FindBy(xpath = ".//*[@id = 'callMeBackPhone']")
    WebElement declineCallMeBackPhoneNumberField;

    /**************************************************METHODS**********************************************/

    /**
     * @Methhods: for work with PP
     * */

}
