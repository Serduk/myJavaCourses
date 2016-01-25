package dating.mob.pages;

import core.browser.AbstractWebPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

/**
 * Created by sergey on 1/25/16.
 */
public class BaseSearchPage extends AbstractWebPage{
    public BaseSearchPage(WebDriver driver) {
        super(driver);
    }

    /**
     * Describe all elements on page
     */

    @FindBy(xpath = ".//*[@id='toolbar-home']")
    public WebElement mainLeftMenuBtn;

    @FindBy(xpath = ".//*[@id='toolbarSearchResultList']")
    public WebElement toolbarSearchResultList;

    @FindBy(xpath = ".//*[@id='toolbarSearchResultGallery']")
    public WebElement toolbarSearchResultGallery;

    @FindBy(xpath = ".//*[@id='toolbarSearchMap']")
    public WebElement toolbarSearchMap;

    @FindBy(xpath = ".//*[@id='toolbarVod']")
    public WebElement toolbarVod;

    @FindBy(xpath = ".//*[@id='toolbarSearchForm']")
    public WebElement toolbarSearchForm;

    @FindBy(xpath = ".//*[@id='activityNotificationBookmark']")
    public WebElement activityNotificationBookmark;

    //shown only if you get to footer
    @FindBy(xpath = ".//*[@id='buttonToTop']")
    public WebElement buttonToTop;

    //Banner Upgrade on footer. shown only for freeeUser
    @FindBy(xpath = ".//*[@class='srh-upgrade-box']")
    public WebElement upgrateBannerInFooter;

    //Users list on search Page
    @FindBy(xpath = ".//*[@class='srh-user cf']")
    public List<WebElement> userListInSearch;

//    @FindBy(xpath = ".//*[@class='srh-user cf']")
//    public WebElement userListInSearc;

    //SendMessageButton
    @FindBy(xpath = ".//*[@class='usr-action message']")
    public WebElement messageBtn;

    @FindBy(xpath = ".//*[@class='usr-action wink']")
    public WebElement winkBtn;

    @FindBy(xpath = ".//*[@class='usr-action favourite']")
    public WebElement addToFriend;
}
