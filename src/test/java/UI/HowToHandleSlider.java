package UI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HowToHandleSlider {
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver();	
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/slider/#colorpicker");
		driver.manage().window().maximize();		
		
		WebElement frame = driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
		driver.switchTo().frame(frame);
		
		WebElement redslider = driver.findElement(By.xpath("//*[@id=\"red\"]/div"));		
		
		Actions action = new Actions(driver);
		action.dragAndDropBy(redslider, -100, 120).perform();
		driver.switchTo().defaultContent();  
		
	
		
		
		}
}
