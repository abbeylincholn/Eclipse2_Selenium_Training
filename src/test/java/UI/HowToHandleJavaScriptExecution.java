package UI;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HowToHandleJavaScriptExecution {
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver();
		ChromeDriver driver = new ChromeDriver();	
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"accept-choices\"]")).click();
		
		JavascriptExecutor jsexec =(JavascriptExecutor) driver;
		
		// Print the title of the page
		String script = "return document.title;";
		String title = (String) jsexec.executeScript(script);
		System.out.println(title);
		
		//Click button
		driver.switchTo().frame("iframeResult");
		jsexec.executeScript("myFunction()");
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		//Highlight
		WebElement button = driver.findElement(By.xpath("/html/body/button"));
		jsexec.executeScript("arguments[0].style.border='5px dotted yellow'", button);
		
		//Scroll
		driver.navigate().to("https://www.w3schools.com/");
		WebElement certifiedButton = driver.findElement(By.xpath("//*[@id=\"spacemyfooter\"]/div[1]/div[6]/a"));
		jsexec.executeScript("arguments[0].scrollIntoView(true);", certifiedButton);
		
		
		

	}

}
