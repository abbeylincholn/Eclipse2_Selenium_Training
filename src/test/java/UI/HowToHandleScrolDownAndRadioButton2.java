package UI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HowToHandleScrolDownAndRadioButton2 {
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver();	
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		driver.manage().window().maximize();
		
		
		WebElement radio = driver.findElement(By.xpath("/html/body/div/main/div[9]/div[2]/div/div/a"));
		Actions actions = new Actions(driver);
		actions.moveToElement(radio);
		actions.perform();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div/main/div[9]/div[2]/div/div/a")).click();
		Thread.sleep(2000);
		
		
		}

}
