package UI;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WorkingWithWebElement {
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://shop.bet9ja.com/");
		driver.manage().window().maximize();

		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);

		String title = driver.getTitle();
		System.out.println(title);

		String pageSource = driver.getPageSource();
		System.out.println(pageSource);

		driver.navigate().to("http://www.google.com");

		driver.navigate().to("http://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();

		List<WebElement> webElements = driver.findElements(By.xpath("//div[@class='inventory_list']//div"));
		System.out.println(webElements);

		driver.switchTo().newWindow(WindowType.TAB);
		Thread.sleep(2000);
		driver.navigate().to("https://www.sugarcrm.com");

		// driver.close();

	}

}
