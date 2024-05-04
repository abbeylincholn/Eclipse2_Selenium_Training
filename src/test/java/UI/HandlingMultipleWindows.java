package UI;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingMultipleWindows {
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver();	
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.salesforce.com/au/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]")).click();
		driver.findElement(By.className("cta_button")).click();
		Thread.sleep(2000);
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles);
		
		Iterator<String> iterator = windowHandles.iterator();
		String parentWindow = iterator.next();
		System.out.println(parentWindow);
		String childWindow = iterator.next();
		System.out.println(childWindow);
				
		driver.switchTo().window(childWindow);
		driver.findElement(By.name("UserFirstName")).sendKeys("RCV");
		driver.findElement(By.name("UserLastName")).sendKeys("Academy");
	
		driver.switchTo().window(parentWindow);
		
	}

}
