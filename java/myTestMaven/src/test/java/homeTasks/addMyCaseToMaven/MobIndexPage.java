package test.java.homeTasks.addMyCaseToMaven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by serega on 23/12/15.
 */
public class MobIndexPage {
    int tmp = 5;
    //public WebDriver driver;

    /****************WebElements*****************/
    @FindBy(xpath = ".//*[@class='btn-update']")
    public WebElement sugnUpButton;

    @FindBy(xpath = ".//*[@name='UserForm_gender']")
    public WebElement genderChoose;

    @FindBy(xpath = ".//*[@class='frm-location']")
    public WebElement postalCode;

    @FindBy(xpath = ".//*[@id='UserForm_day']")
    public WebElement birthDay;

    @FindBy(xpath = ".//*[@id='UserForm_month']")
    public WebElement birthMonth;

    @FindBy(xpath = ".//*[@id='UserForm_year']")
    public WebElement birthYear;

    @FindBy(xpath = ".//*[@id='UserForm_just_email']")
    public WebElement emailInput;

    @FindBy(xpath = ".//*[@id='register_frm']")
    public WebElement submitForm;

    @FindBy(xpath = ".//*[@id='UserForm_password']")
    public WebElement password;



    /*********************Methods******************/
    public void choseValidAge() throws InterruptedException {
        Select day = new Select(birthDay);
        day.selectByIndex(tmp);
        Select month = new Select(birthMonth);
        month.selectByIndex(tmp);
        Select year = new Select(birthYear);
        year.selectByIndex(tmp);
    }
}
