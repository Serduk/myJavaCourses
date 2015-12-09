package pmHome.homeWorks.pmHomeWork3RegDating;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Serduk on 20.11.2015.
 */
public class LocationProxy {

    static WebDriver proxy = new FirefoxDriver();

    public static void GBR(){
        proxy.manage().addCookie(new Cookie("ip_address", "213.171.197.181"));
    }

    public static void USA(){
        proxy.manage().addCookie(new Cookie("ip_address", "69.147.251.50"));
    }

    public static void AUS(){
        proxy.manage().addCookie(new Cookie("ip_address", "223.252.33.75"));
    }
}

//        ("NZL", "49.50.242.137");
//        ("IRL", "176.34.184.134");
//        ("CAN", "199.167.19.29");
//        ("FRA", "91.121.80.205");
//        ("ESP", "91.142.213.109");
//        ("NOR", "81.27.33.8");
//        ("DNK", "94.231.110.81");
//        ("ITA", "195.88.7.112");
//        ("SWE", "91.189.44.162");
//        ("SWI", "92.42.186.167");
//        ("GER", "80.237.249.248");
//        ("DEU", "80.237.249.248");
//        ("AUST", "149.154.153.92");
//        ("BRA", "186.226.60.92");
//        ("CZE", "81.2.197.93");
//        ("BEL", "81.95.121.251");
//        ("FIN", "212.94.78.134");
//        ("SPA", "91.142.213.109");
