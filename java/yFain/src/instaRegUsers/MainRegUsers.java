package instaRegUsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by sergey on 1/19/16.
 */
public class MainRegUsers {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/sources/chromedriver_x64");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.instagram.com/");


    }
}
