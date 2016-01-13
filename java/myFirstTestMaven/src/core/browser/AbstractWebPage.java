package core.browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class AbstractWebPage {

    /**
     * Constructor
    * @param driver
    */
    public WebDriver driver;

    public AbstractWebPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
}