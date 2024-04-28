package UI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HowToHandleScrolDownAndRadioButton {
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver();	
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		
		// Line 18-21 is used to scroll to the webElement
		WebElement radio = driver.findElement(By.xpath("//input[@value='Car']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(radio);
		actions.perform();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Car']")).click();
		Thread.sleep(2000);
		
		
		}

}
