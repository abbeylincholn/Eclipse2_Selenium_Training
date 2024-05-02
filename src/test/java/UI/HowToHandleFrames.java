package UI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HowToHandleFrames {
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"accept-choices\"]")).click();

//			driver.switchTo().frame(0);	// frame by index
//			driver.switchTo().frame("iframeResult"); // frame by name or Id

		WebElement frame1 = driver.findElement(By.id("iframeResult")); // frame by webElement
		driver.switchTo().frame(frame1);
		driver.findElement(By.xpath("/html/body/button")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		driver.switchTo().parentFrame();
		Thread.sleep(2000);
		
//		driver.switchTo().defaultContent();
//		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"menuButton\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"navbarDropMenu\"]/span")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"tryhome\"]")).click();
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		driver.quit();

	}

}
