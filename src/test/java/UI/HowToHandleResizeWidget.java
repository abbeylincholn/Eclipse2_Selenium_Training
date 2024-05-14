package UI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HowToHandleResizeWidget {
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver();	
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/resizable/");
		driver.manage().window().maximize();		
		
		WebElement frame = driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
		driver.switchTo().frame(frame);
		
		WebElement resize = driver.findElement(By.xpath("//*[@id=\"resizable\"]/div[3]"));		
		
		Actions action = new Actions(driver);
		action.dragAndDropBy(resize, 300, 100).perform();
		driver.switchTo().defaultContent();  
		
	
		
		
		}
}
