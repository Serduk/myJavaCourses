//instagram;
//login;
//go to Ella;
//Comment on photo Ella;
//Add random input symbols (delay);
package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import test.GenerateRandom;

public class LoginGoToEllaComment {
	public static void main(String[] args) throws InterruptedException {
		FirefoxDriver driver = new FirefoxDriver();
		
		
		driver.get("https://instagram.com");		
		driver.findElement(By.className("home-login")).click();

		WebElement myDynamicElement = (new WebDriverWait(driver, 10))
		  .until(ExpectedConditions.presenceOfElementLocated(By.id("lfFieldInputUsername")));
				
		
		
		//driver.findElement(By.className("lfFieldInputUsername")).click();
		driver.findElement(By.id("lfFieldInputUsername")).sendKeys("_cypres_");
		
		GenerateRandom.randInt(2000, 19000);
		
		driver.findElement(By.id("lfFieldInputPassword")).sendKeys("123X123X");
		driver.findElement(By.className("lfSubmit")).click();	
		driver.get("https://instagram.com/ella_zv/");
		

		WebElement myDynamicElement1 = (new WebDriverWait(driver, 10))
		  .until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[@id='react-root']/div/div/div/div/div[2]/div[1]/div[1]/div[1]/div/a")));
			
		
		driver.findElement(By.xpath(".//*[@id='react-root']/div/div/div/div/div[2]/div[1]/div[1]/div[1]/div/a")).click();
		driver.findElement(By.xpath(".//*[@id='layer0']/div/div/div[2]/div/div/div/div/div[2]/div[2]/div/input")).sendKeys("Very Nice!!!");
		
	}

}