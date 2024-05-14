package UI;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HowToPerformKeyboardEvents {
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver();	
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://extendsclass.com/text-compare.html");
		driver.manage().window().maximize();	
		
		driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[1]/div[2]/div[2]/button[1]/p")).click();
		
					
		WebElement sourceTextArea = driver.findElement(By.xpath("//*[@id=\"dropZone\"]//div[4]/pre/span"));		
		Actions action = new Actions(driver);
		Thread.sleep(2000);
		action.keyDown(sourceTextArea, Keys.CONTROL).sendKeys("a").sendKeys("c").build().perform();
			
		WebElement destinationTextArea = driver.findElement(By.xpath("//*[@id=\"dropZone2\"]//div[5]/pre"));		
		Thread.sleep(2000);
		action.keyDown(destinationTextArea, Keys.CONTROL).sendKeys("a").sendKeys("v").build().perform();
		
		}
}
