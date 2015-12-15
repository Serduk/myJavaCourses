package test;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

import test.ProxyUtils.Proxy;




public class ProxyTest {

	
	
	
	
	
	public static void main(String[] args) {
		
		
		
		FirefoxDriver driver = BrowserUtis.getFireFoxBrowserWithRandomProxy();

		driver.get("http://2ip.ru/");
		
		
		
		

	}
	
	
	
	
	
	
	
	
	
	
	

}
