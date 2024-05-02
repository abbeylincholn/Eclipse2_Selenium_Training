package UI;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HowToHandleAlertPopup {
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver();
		ChromeDriver driver = new ChromeDriver();
		
/*		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"accept-choices\"]")).click();
		Thread.sleep(2000);
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("/html/body/button")).click();
		Thread.sleep(1000);
		
		String alertText = driver.switchTo().alert().getText();
		System.out.println(alertText);
		driver.switchTo().alert().accept();  // check the documentation to see dismiss and sendkeys method   */
		
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"accept-choices\"]")).click();
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("/html/body/button")).click();
		Thread.sleep(3000);
		Alert alertOnPage = driver.switchTo().alert();	
		
		alertOnPage.sendKeys("Hello Abbey");
		Thread.sleep(1000);
		alertOnPage.accept();
		
		
		System.out.println(alertOnPage);
		
		driver.switchTo().parentFrame();
		System.out.println(driver.getTitle());
		driver.quit();
		

	}

}
