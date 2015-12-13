package pmHome.pmClassWork.pmLess5TestNG;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

/**
 * Created by serega on 09/12/15.
 */
public class firstRunTestNG {
    WebDriver driver;

//    @BeforeTest
//    public void setup(){
//        System.out.println("@BeforeTest");
//        driver = new FirefoxDriver();
//    }

    @BeforeMethod
    public void setUp(){
        System.out.println("@BeforeMethod");
        driver = new FirefoxDriver();
    }

    @Test
    public void test1(){
        driver.get("https://google.com");
        Assert.assertTrue(driver.getCurrentUrl().contains("google"));
        System.out.println("I am a first test");
    }
    @Test
    public void test2(){
        driver.get("https://ya.ru");
        Assert.assertTrue(driver.getCurrentUrl().contains("ya"));
        System.out.println("I am a second test");
    }

//    @AfterTest
//    public void shutDown(){
//        System.out.println("@AfterTest");
//        driver.quit();
//    }

    @AfterMethod
    public void shutDownMethod(){
        System.out.println("@AfterMethod");
        driver.quit();
    }
}
