package UI;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver();	
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");		
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(3000);
		//driver.close();
		
		 
		
		
		
		
		

	}

}
