package UI;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggestDropDown {
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.booking.com");
		driver.manage().window().maximize();

		driver.findElement(By.name("ss")).click();
		//driver.findElement(By.xpath("//input[@placeholder='Where are you going?']")).click();
		WebElement SearchBox = driver.findElement(By.xpath("//input[@placeholder='Where are you going?']"));
		Thread.sleep(2000);
		SearchBox.sendKeys("Lagos, Nigeria");
		Thread.sleep(2000);
		SearchBox.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		SearchBox.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
	}

}
