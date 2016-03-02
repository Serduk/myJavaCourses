package dating.mob.pages;

import core.data.UserData;
import core.browser.AbstractWebPage;
import core.constans.Constans;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

/**
 * @TODO describe Login Form; footer;
 * */

/**
 * Created by sergey on 1/13/16.
 */
public class BaseIndexPage extends AbstractWebPage {
    public BaseIndexPage(WebDriver driver) {
        super(driver);
    }

    UserData userData = new UserData();
    Constans constans = new Constans();

    /**
     * Describe all elements on page
     */

    /*
	 * Sign up button on index page
	 */
    @FindBy(id = "goreg")
    public WebElement signUp;

    /*
    * gender male
    */
    @FindBy(xpath = ".//*[@id='UserForm_gender']")
    public WebElement GenderMale;

    /*email field*/
    @FindBy(xpath = ".//*[@id='UserForm_just_email']")
    public WebElement emailField;

    /*postalcode*/
    @FindBy(xpath = ".//*[@id='UserForm_location']")
    public WebElement postCodeField;

    /*Day born*/
    @FindBy(xpath = ".//*[@id='UserForm_day']")
    WebElement birthDayDrop;
    public Select daySelector(){
        return new Select(birthDayDrop);
    }

    /*Month born*/
    @FindBy(xpath = ".//*[@id='UserForm_month']")
    WebElement birthMonthDrop;
    public Select monthSelector(){
        return new Select(birthMonthDrop);
    }

    /*Year Born*/
    @FindBy(xpath = ".//*[@id='UserForm_year']")
    WebElement birthYearDrop;
    public Select yearSelector(){
        return new Select(birthYearDrop);
    }

    /*mobile phone field*/
    @FindBy(xpath = ".//*[@id='UserForm_msisdn']")
    public WebElement mobilePhoneField;

    /*password field*/
    @FindBy(xpath = ".//*[@id='UserForm_password']")
    public WebElement passwordField;

    /*submit button on reg page*/
    @FindBy(xpath = ".//*[@id='btn_register_submit']")
    public WebElement submitButton;

    /*submit form to reg*/
    @FindBy(xpath = ".//*[@id='register_frm']")
    public WebElement submitForm;

    /*Terms*/
    @FindBy(xpath = ".//a[@href='/staticPage/terms']")
    WebElement termsOfUse;

    /*Privacy*/
    @FindBy(xpath = ".//a[@href='/staticPage/privacypolicy']")
    WebElement privacyPolicy;

    /**
     * Methods
     */

    /***Helper Metods***/
    public void goToSignUpPage(){
        signUp.click();
    }

    /***Correct Fill Registration Data***/
    public void fillRegistrationDataMans(String location) {
        System.out.println("Fill registration fields");
        goToSignUpPage();
        daySelector().selectByValue("5");
        monthSelector().selectByValue("05");
        yearSelector().selectByValue("1990");
        fillLocation(location);
        emailField.sendKeys(userData.getUiniqueUserEmail());
        passwordField.sendKeys(constans.TEST_PASSWORD_FOR_REG_ON_SITES);

        if (driver instanceof JavascriptExecutor) {
            ((JavascriptExecutor) driver)
                    .executeScript("$('.b-location-autocomplete').hide();");
        }
//        $this->driver->executeScript("$('.ac_results').hide()");
//        $('.b-location-autocomplete').show();


    }

    public void fillLocation(String location) {
        postCodeField.sendKeys(location);
        if (driver instanceof JavascriptExecutor) {
            ((JavascriptExecutor) driver)
                    .executeScript("$('.b-location-autocomplete').hide();");
        }
    }

    /**Submit Registration by Submit Form !clickOnBatton*/
    public void submitRegForm(){
        submitForm.submit();
    }

    public String getUserEmail() {
        return emailField.getAttribute("value");
    }
    public String getUserPassword() {
        return passwordField.getAttribute("value");
    }
}
