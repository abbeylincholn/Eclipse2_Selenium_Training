package UI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButtonCheckbox {
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver();	
		ChromeDriver driver = new ChromeDriver();
		//driver.get("https://www.singaporeair.com/en_UK/de/home#/book/bookflight");
		driver.navigate().to("https://www.singaporeair.com/en_UK/de/home#/managebooking");
		driver.manage().window().maximize();
		
//		WebElement radio1 =  driver.findElement(By.id("redeemFlights"));
//		WebElement radio2 =  driver.findElement(By.id("bookFlights"));
		
//		radio1.click();
//		System.out.println(radio1.isSelected());
//		System.out.println(radio2.isSelected());    
		
		
		WebElement radio4 =  driver.findElement(By.id("eticketNumberRadio"));
		//WebElement radio4 =  driver.findElement(By.xpath("//*[@id=\"eticketNumberRadio\"]"));
		WebElement radio3 =  driver.findElement(By.id("bookReferenceRadio"));
		//driver.findElement(By.className("dwc--SiaCookie__PopupEssentialBtn dwc--SiaCookie__PopupAllBtn")).click();
	
		
	/*	radio4.click();
		System.out.println(radio3.isSelected());
		System.out.println(radio4.isSelected());
		Thread.sleep(2000);		
		
		radio3.click();
		System.out.println(radio3.isSelected());
		System.out.println(radio4.isSelected());		 */	
		
		}

}
