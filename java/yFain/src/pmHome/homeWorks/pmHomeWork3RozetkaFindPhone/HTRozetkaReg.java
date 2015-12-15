package pmHome.homeWorks.pmHomeWork3RozetkaFindPhone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

/**
 * Created by serega on 18/11/15.
 */
public class HTRozetkaReg {
    public static void main(String[] args) {
        WebDriver dr = new FirefoxDriver();

        dr.get("http://rozetka.com.ua/mobile-phones/c80003/filter/preset=smartfon/");

        List<WebElement> allTopSale = dr.findElements(By.xpath(".//*[@class = 'g-tag  g-tag-icon-middle-popularity sprite']/ancestor::div[3]"));


        System.out.println(allTopSale.size());
        for (int i = 0; i < 3; i++) {
            WebElement getName = allTopSale.get(i).findElement(By.xpath(".//*[@class='g-i-tile-i-title clearfix']/a"));
            System.out.println(getName.getText());
        }

        dr.quit();
    }
}
