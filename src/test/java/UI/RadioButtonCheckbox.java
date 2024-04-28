package UI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButtonCheckbox {
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver();	
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.singaporeair.com/en_UK/de/home#/book/bookflight");
		driver.manage().window().maximize();
		
		/*
		WebElement radio1 =  driver.findElement(By.id("redeemFlights"));
		WebElement radio2 =  driver.findElement(By.id("bookFlights"));
		
		radio1.click();
		System.out.println(radio1.isSelected());
		System.out.println(radio2.isSelected());     */
		
		
		
		
		
		
		}

}
