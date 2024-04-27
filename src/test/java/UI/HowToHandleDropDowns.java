package UI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HowToHandleDropDowns {
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver();	
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.sugarcrm.com/uk/request-demo/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll")).click();
		
		driver.findElement(By.name("email")).sendKeys("godwitusglobal@gmail.com");
		
		WebElement dropDown =  driver.findElement(By.name("employees_c"));
		Select select = new Select(dropDown);
		
		select.selectByValue("level1");
		Thread.sleep(3000);
		
		select.selectByVisibleText("51 - 100 employees");
		Thread.sleep(3000);
		
		select.selectByIndex(9);
		
		

	}

}
