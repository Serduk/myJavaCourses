package pmHome.homeWorks.pmLess4PageObj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by serega on 02/12/15.
 */
public class PopUpS {
     WebElement confirmAgeNotRegisteredUser;

    public PopUpS(WebDriver driver) {
        confirmAgeNotRegisteredUser = driver.findElement(By.xpath(".//*[@class='warningadult-active-btn']"));
    }
}
