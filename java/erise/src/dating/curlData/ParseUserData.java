package dating.curlData;

import core.browser.AbstractWebPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by sergey on 2/18/16.
 */


/**
 * This class can help get all data about user
 * Source site with data: http://192.168.12.28/show/userData/?email=(email)
 * */
public class ParseUserData extends AbstractWebPage{
    public ParseUserData(WebDriver driver) {
        super(driver);
    }

    /**
     * @Elements: Describe all fields on page
     * */
    @FindBy(id = "site")
    WebElement siteName;

    @FindBy(id = "email")
    WebElement email;

    @FindBy(id = "gender")
    WebElement gender;

    @FindBy(id = "screenName")
    WebElement screenName;

    @FindBy(id = "location")
    WebElement location;

    @FindBy(id = "password")
    WebElement password;

    @FindBy(id = "trafficSource")
    WebElement trafficSource;

    @FindBy(id = "userId")
    WebElement userID;

    @FindBy(id = "autologin")
    WebElement autologinID;

    @FindBy(id = "platform")
    WebElement platform;

    @FindBy(id = "regDate")
    WebElement regDate;

    @FindBy(id = "coregistration")
    WebElement coregistration;

    @FindBy(id = "paidStatus")
    WebElement paidstatus;

    @FindBy(id = "autologinUrl")
    WebElement autoLoginURL;


/**==============================================================================================================*/


    /**
     * @Methods For work with data from fields
     * */

    public String getSitename() {
        return siteName.getText();
    }

    public String getEmail() {
       return email.getText();
    }

    public String getGender() {
        return gender.getText();
    }

    public String getScreenName() {
        return screenName.getText();
    }

    public String getLocation() {
        return location.getText();
    }

    public String getPassword() {
        return password.getText();
    }

    public String getTrafficSource() {
        return trafficSource.getText();
    }

    public String getID() {
        return userID.getText();
    }

    public String getAutologinID() {
        return autologinID.getText();
    }

    public String getPlatformRegistration() {
        return platform.getText();
    }

    public String getRegistrationDate() {
        return regDate.getText();
    }

    public String getCorregistration() {
        return coregistration.getText();
    }

    public String getPaidStatus() {
        return paidstatus.getText();
    }

    public String getAutologinURL() {
        return autoLoginURL.getText();
    }


}
