package dating.mob.pages;

import core.browser.AbstractWebPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by sergey on 1/25/16.
 */
public class BaseFunnelPage extends AbstractWebPage {
    public BaseFunnelPage(WebDriver driver) {
        super(driver);
    }

    /** Describe all elements on page*/
    @FindBy(xpath = ".//*[@id='PhotoUploadBtn']")
    public WebElement photoUploadBtn;

    @FindBy(xpath = ".//*[@id='ProfilePhotoUploadSkipBtn']")
    public WebElement photoUploadSkip;


    /** Describe methods*/
    public void funnelSkip(){
        photoUploadSkip.click();
    }
}
