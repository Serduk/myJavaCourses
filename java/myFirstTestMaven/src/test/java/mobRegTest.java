import core.browser.FireFoxUtils;
import dating.mob.pages.BaseIndexPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Created by sergey on 1/13/16.
 */
public class mobRegTest {

    private WebDriver driver;


    @BeforeTest
    public void setup(){
        FireFoxUtils fireFoxBrowser = new FireFoxUtils();
        this.driver = fireFoxBrowser.getDriver();
    }

    @Test
    public void regTest(){
        driver.get("https://naughtyavenue.com");
        BaseIndexPage index = new BaseIndexPage(this.driver);
        index.fillRegistrationDataMans("London");
    }

}
