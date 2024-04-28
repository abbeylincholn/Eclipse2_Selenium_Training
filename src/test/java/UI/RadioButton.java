package UI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButton {
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver();	
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://flyairpeace.com/");
		driver.manage().window().maximize();
		
		
		WebElement radio1 =  driver.findElement(By.id("roundTrip"));
		WebElement radio2 =  driver.findElement(By.id("oneWay"));
		
		radio1.click();
		System.out.println(radio1.isSelected());
		System.out.println(radio2.isSelected());     
		Thread.sleep(2000);	
		radio2.click();
		System.out.println(radio1.isSelected());
		System.out.println(radio2.isSelected());	
		
	
		
		}

}
