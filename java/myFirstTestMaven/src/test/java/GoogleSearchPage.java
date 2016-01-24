import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by sergey on 1/12/16.
 */
public class GoogleSearchPage {
    /**
     * Define WebDriver
     */
    public WebDriver driver;

    /**
     * WebElements
     */
    @FindBy(xpath = ".//*[@name='q']")
    public WebElement searchString;

    /**
     * Methods
     */
    public void searchGoogle(String stringToSearch){
        searchString.sendKeys(stringToSearch);
        searchString.submit();
    }


    /** Constructor */
    public GoogleSearchPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
}
