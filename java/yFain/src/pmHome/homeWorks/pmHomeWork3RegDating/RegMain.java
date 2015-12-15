package pmHome.homeWorks.pmHomeWork3RegDating;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by Serduk on 20.11.2015.
 */
public class RegMain {
    public static void main(String[] args) throws InterruptedException {
        WebDriver dr = new FirefoxDriver();
        RegData rd = new RegData();
        GenerateRandomForEmail random = new GenerateRandomForEmail();

        String trafficSourceAff = "/?surce=utm_int";
        String site = "https://www.naughtyavenue.com";
        String man = "M";
        String woman = "W";
        String pass = "123123aa";
        String locationIs = "Boston";
        int num = 5;
        String mail = "ghjcnjvtqk+" + random.getRandom() + "@gmail.com";
        dr.get(site + "/admin2");


        dr.manage().addCookie(new Cookie("ip_address", "213.171.197.181"));
        System.out.println("Cookie is " + dr.manage().getCookies());


        dr.get(site + trafficSourceAff);

        WebElement gender = dr.findElement(By.xpath(rd.getGender()));
        WebElement setMonthBirth = dr.findElement(By.xpath(rd.monthOfBirth));
        WebElement setYearBirth = dr.findElement(By.xpath(rd.yearBirth));
        WebElement setDayBirth = dr.findElement(By.xpath(rd.dayBirth));
        WebElement setEmail = dr.findElement(By.xpath(rd.email));
        WebElement setPass = dr.findElement(By.xpath(rd.password));
        WebElement setLocation = dr.findElement(By.xpath(rd.location));
        WebElement sendData = dr.findElement(By.xpath(rd.submitBuuton));
        WebElement chekWrongMail = dr.findElement(By.xpath(rd.wrongEmail));

//        Thread.sleep(3000);

        //set gender
        rd.setGender(man);
        gender.click();

        //set date
        Select day = new Select(setDayBirth);
        day.selectByIndex(num);
        Select month = new Select(setMonthBirth);
        month.selectByIndex(num);
        Select year = new Select(setYearBirth);
        year.selectByIndex(num);

        setEmail.sendKeys(mail);

        setPass.sendKeys(pass);
        setLocation.sendKeys(locationIs);

        sendData.click();
        Thread.sleep(4000);
        sendData.click();


        Thread.sleep(4000);
        WebElement yourCurrentMail = dr.findElement(By.xpath(rd.finalCheckMail));

        String yourCurrUrl = dr.getCurrentUrl();
        System.out.println(yourCurrUrl);
        System.out.println(yourCurrentMail.getText());


    }
}
