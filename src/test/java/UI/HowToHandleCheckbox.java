package UI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HowToHandleCheckbox {
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver();	
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//div[@id='HTML33']//input[@value='Pen']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='HTML33']//input[@value='Pen']")).click();
		Thread.sleep(2000);
		}

}
