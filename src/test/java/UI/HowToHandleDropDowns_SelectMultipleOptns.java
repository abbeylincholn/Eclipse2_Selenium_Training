package UI;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HowToHandleDropDowns_SelectMultipleOptns {
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();

		WebElement dropDown = driver.findElement(By.id("multiselect1"));
		Select select = new Select(dropDown);
		select.selectByValue("volvox");
		Thread.sleep(2000);
		select.selectByIndex(3);
		Thread.sleep(2000);
		/*
		 * List<WebElement> allItems = select.getAllSelectedOptions();
		 * System.out.println(allItems.size()); select.deselectAll();
		 * Thread.sleep(2000);
		 * 
		 * select.selectByValue("volvox"); Thread.sleep(2000); select.selectByIndex(3);
		 * Thread.sleep(2000);
		 * 
		 * select.deselectByIndex(3); Thread.sleep(2000); List<WebElement> allItems1 =
		 * select.getAllSelectedOptions(); System.out.println(allItems1.size());
		 * 
		 */
		
		

		WebElement firstSelected = select.getFirstSelectedOption();
		System.out.println(firstSelected.getText());

	}

}
