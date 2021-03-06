package pmHome.homeWorks.pmHomeWork4EnumAndRegUserMob;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by serega on 08/12/15.
 */
public class MobIndexPage {
    UserData ud = new UserData();
    WebElement signUpButton;
    WebElement choseGender;
    WebElement postCode;
    WebElement birthDay;
    WebElement birthMonth;
    WebElement birthYear;
    WebElement email;
    WebElement mobileNumber;
    WebElement password;
    WebElement submitButton;
    WebElement submitForm;



    public MobIndexPage(WebDriver driver) {
        this.signUpButton = driver.findElement(By.xpath(".//*[@class='btn-update']")); //.//*[@id='goreg']
        this.choseGender = driver.findElement(By.xpath(".//*[@id='UserForm_gender']"));
        this.postCode = driver.findElement(By.xpath(".//*[@id='UserForm_location']"));
        this.birthDay = driver.findElement(By.xpath(".//*[@id='UserForm_day']"));
        this.birthMonth = driver.findElement(By.xpath(".//*[@id='UserForm_month']"));
        this.birthYear = driver.findElement(By.xpath(".//*[@id='UserForm_year']"));
        this.email = driver.findElement(By.xpath(".//*[@id='UserForm_just_email']"));
        this.mobileNumber = driver.findElement(By.xpath(".//*[@id='UserForm_msisdn']"));
        this.password = driver.findElement(By.xpath(".//*[@id='UserForm_password']"));
        this.submitButton = driver.findElement(By.xpath(".//*[@id='btn_register_submit']"));
        this.submitForm = driver.findElement(By.xpath(".//*[@id='register_frm']"));
    }
}
