package UI;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locator {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver();	
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://shop.bet9ja.com/");
		//driver.findElement(By.linkText("Become an Agent")).click();
		//driver.findElement(By.partialLinkText("Become")).click();
		// more locators by classname, css selector, ID, name, xpath, tagname
		
		
	}

}
