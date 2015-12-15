package pmHome.homeWorks.pmHomeWork3RegDating;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by serega on 08/12/15.
 */
public class PopUps {
    public WebElement locationAutoComplete;

    public PopUps(WebDriver driver) {
        this.locationAutoComplete = driver.findElement(By.xpath("b-location-autocomplete"));

    }
}
