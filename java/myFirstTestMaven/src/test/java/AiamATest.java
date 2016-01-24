import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

/**
 * Created by sergey on 1/12/16.
 */
public class AiamATest {
    @Test
    public void test(){
        System.out.println("I am a test");
    }

    @Test
    public void testGoogle() throws InterruptedException {
        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.google.com.ua/");
        GoogleSearchPage googleSearchPage = new GoogleSearchPage(driver);

        googleSearchPage.searchGoogle("Page Factory is amazing!!!");
        Thread.sleep(3000);
        System.out.println("fine");
        driver.quit();
    }
}
