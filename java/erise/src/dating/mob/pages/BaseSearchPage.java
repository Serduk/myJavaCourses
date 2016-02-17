package dating.mob.pages;

import core.browser.AbstractWebPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

/**
 * @TODO Describe left menu; notificator; header; footer; searchSettings;
 * */

/**
 * Created by sergey on 1/25/16.
 */
public class BaseSearchPage extends AbstractWebPage{
    public BaseSearchPage(WebDriver driver) {
        super(driver);
    }

    /**
     * @Elements in search
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


    WebElement messageBtn;
    WebElement winkBtn;
    WebElement addToFriendBtn;


    /**
     * @Elements in messenger
     * Describe Element on Messenger Menu
     * */
    @FindBy(xpath = ".//*[@id='messengerInput']")
    WebElement inputForSendMessage;

    @FindBy(xpath = ".//*[@id='messengerSend']")
    WebElement messengerSendBtn;

    @FindBy(xpath = ".//*[@data-userlogin]")
    WebElement anotherProfileName;


    /**
     * @Elements in left menu
     * Describe all elements in leftMenu
     * */

    /**
     * @Elements in Search setting (rightmenu)
     * Describe all elements in rightMenuSearch Settings
     * */





    /*****************ALL METHODS********************/

    /**
     * @Methods for add to sendMessageBtnClick
     */
    public void clickOnMessageBtn(int userNum) {
        messageBtn = userListInSearch.get(userNum).findElement(By.xpath(".//*[@class='usr-action message']"));
        messageBtn.click();
    }

    /**
     * @Method wink someProfile
     * */
    public void clickOnWinkBtn(int userNum) {
        winkBtn = userListInSearch.get(userNum).findElement(By.xpath(".//*[@class='usr-action wink']"));
        winkBtn.click();
    }


    /**
    * @Method addToFriend
     * */
    public void clickOnAddToFriendBtn(int userNum) {
        addToFriendBtn = userListInSearch.get(userNum).findElement(By.xpath(".//*[@class='usr-action favourite']"));
        addToFriendBtn.click();
    }


    /************ METHODS IN MESSENGER***********/

    /**
    * @Method getName companion in chat
    * */
    public String getNameCompanion() {
        String name = anotherProfileName.getText();
        return name;
    }

    /**
     * @Method Send one free message to 1 user and go back
     * */
    //End condition to check model is dont sent any message? if no -> send message, if yes -> open another profile
    public void sendMessageToOneUser(int userNum, String someMessage){
        clickOnMessageBtn(userNum);
        inputForSendMessage.sendKeys(someMessage + " " + getNameCompanion() + "!");
        messengerSendBtn.click();
        driver.navigate().back();
    }

    public void writeMessage(int userNum, String someMessage) {
        clickOnMessageBtn(userNum);
//        inputForSendMessage.sendKeys(someMessage + " " + getNameCompanion() + "!");
//        messengerSendBtn.click();
    }

    /**
     * @Method send 5 free message
     * */
    public void sendFiveFreeMessageDiffUsers(String someMessage) {
        int userNum = 0;
        for (int messageAlreadySent = 0; messageAlreadySent < 5; messageAlreadySent++) {
            sendMessageToOneUser(userNum, someMessage);
            userNum++;
        }
    }
}
