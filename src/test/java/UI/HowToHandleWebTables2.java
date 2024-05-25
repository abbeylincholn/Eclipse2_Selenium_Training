package UI;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HowToHandleWebTables2 {

	public static void main(String[] args) throws InterruptedException {
		// step 1- Switch to frame which has that particular table if the table is
		// inside a frame
		// step 2- Get the number of rows
		// step 3- Get the number of columns
		// step 4-iterate rows and columns and get text and print it

		WebDriverManager.chromedriver();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.asx.com.au/");
		driver.navigate().to("https://www.asx.com.au/markets/trade-our-cash-market/equity-market-prices");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]")).click();
		
		WebElement radio = driver.findElement(By.xpath("//*[@id=\"home_top_twenty\"]/div/div[2]/a"));
		Actions actions = new Actions(driver);
		actions.moveToElement(radio);
		actions.perform();		
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));			
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"home_top_twenty\"]/div/div[2]/a"))).click();
		

		List<WebElement> rowElements = driver
				.findElements(By.xpath("//*[@id=\"home_top_twenty\"]/div/div[1]/div/div[1]/table/tr"));
		System.out.println(" rowSize = " + rowElements.size());
		int rowSize = rowElements.size();

		List<WebElement> colElements = driver
				.findElements(By.xpath("//*[@id=\"home_top_twenty\"]/div/div[1]/div/div[1]/table/tr[2]/td"));
		System.out.println(" colSize = " + colElements.size());
		int colSize = colElements.size();

		for (int i = 2; i <= rowSize; i++) {
			for (int j = 1; j <= colSize; j++) {

				System.out.print(driver
						.findElement(By.xpath(
								"//*[@id=\"home_top_twenty\"]/div/div[1]/div/div[1]/table/tr[" + i + "]/td[" + j + "]"))
						.getText() + "  ");
			}
			System.out.println(); 

		}  

	}
}
