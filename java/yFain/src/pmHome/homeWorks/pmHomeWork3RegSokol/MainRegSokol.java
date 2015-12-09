package pmHome.homeWorks.pmHomeWork3RegSokol;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by serega on 21/11/15.
 */
public class MainRegSokol {
    public static void main(String[] args) throws InterruptedException {
        WebDriver dr = new FirefoxDriver();
        UserData ud = new UserData();
        PageData pd = new PageData();

        String sokil = "http://my.sokol.ua/signup/";
        String mySokil = "http://my.sokol.ua/";
        int num = 5;

        dr.get(sokil);

        WebElement setEmail = dr.findElement(By.xpath(pd.pEmail));
        WebElement setPass = dr.findElement(By.xpath(pd.pPass));
        WebElement bNext = dr.findElement(By.xpath(pd.pButtonNext));

        setEmail.sendKeys(ud.email);
        setPass.sendKeys(ud.password);
        bNext.click();

        Thread.sleep(3000);

        WebElement setName = dr.findElement(By.xpath(pd.pName));
        WebElement setSurName = dr.findElement(By.xpath(pd.pSurname));
        WebElement setPhone = dr.findElement(By.xpath(pd.pPhoneNumber));
        WebElement setDateBirth = dr.findElement(By.xpath(pd.pDateBirth));
        WebElement setMonthBirth = dr.findElement(By.xpath(pd.pMonth));
        WebElement setYearBirth = dr.findElement(By.xpath(pd.pYearBirth));
        WebElement bReg = dr.findElement(By.xpath(pd.pRegButton));

        setName.sendKeys(ud.name);
        setSurName.sendKeys(ud.surname);
        setPhone.sendKeys(ud.phone);
        setDateBirth.sendKeys(ud.dayBirth);
        Select month = new Select(setMonthBirth);
        month.selectByIndex(num);
        setYearBirth.sendKeys(ud.yearBirth);


        do {
//            bReg.submit();
            bReg.click();
            Thread.sleep(2000);
        } while (!(dr.getCurrentUrl().equals(mySokil)));

        System.out.println("My current URL: " + dr.getCurrentUrl());
        System.out.println("My Email = " + ud.email);
        System.out.println("My Pass = " + ud.password);


    }
}
