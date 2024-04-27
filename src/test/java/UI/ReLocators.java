package UI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReLocators {
	
	public static void main(String[] args) {
		
		
	/*	WebDriverManager.chromedriver();	
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		//above and below
		
		By passwordLocator = By.id("password");
		WebElement password = driver.findElement(passwordLocator);
		WebElement username = driver.findElement(RelativeLocator.with(By.tagName("input")).above(passwordLocator));
		WebElement loginButton = driver.findElement(RelativeLocator.with(By.tagName("input")).below(passwordLocator));
		
		username.sendKeys("standard_user");
		password.sendKeys("secret_sauce");
		loginButton.click();  */
		
		
		WebDriverManager.chromedriver();	
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://shop.bet9ja.com/");
		driver.manage().window().maximize();
		
		
		WebElement bookBet = driver.findElement(By.className("bookBet"));
		WebElement report = driver.findElement(RelativeLocator.with(By.tagName("a")).toRightOf(bookBet));
		report.click();
		
		
		
		
		

		
		
		
		
		
		
		
		

}


	
	}
