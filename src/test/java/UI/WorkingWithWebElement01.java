package UI;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WorkingWithWebElement01 {
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.sugarcrm.com/uk/");
		driver.manage().window().maximize();
		// driver.navigate().to("https://www.sugarcrm.com/au/request-demo/");
		driver.findElement(By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll")).click();
		driver.findElement(By.xpath("//a[text()='Get A Demo']")).click();

		Thread.sleep(3000);
		driver.findElement(By.name("email")).sendKeys("Testing");
		Thread.sleep(3000);
		driver.findElement(By.name("email")).clear();

		System.out.println(driver.findElement(By.name("email")).getAttribute("class"));
		System.out.println(driver.findElement(By.xpath("//*[@id=\"field1\"]/div/input")).getCssValue("text-transform"));
		System.out.println(driver.findElement(By.xpath("//*[@id=\"field1\"]/div/input")).getSize());
		System.out.println(driver.findElement(By.xpath("//*[@id=\"field1\"]/div/input")).getLocation());
		System.out.println(driver.findElement(By.xpath("//*[@id=\"field1\"]/div/input")).getText());
		System.out.println(driver.findElement(By.xpath("//*[@id=\"field1\"]/div/input")).getTagName());
		System.out.println(driver.findElement(By.xpath("//*[@id=\"field1\"]/div/input")).isDisplayed());
		System.out.println(driver.findElement(By.xpath("//*[@id=\"field1\"]/div/input")).isEnabled());
		System.out.println(driver.findElement(By.xpath("//*[@id=\"field1\"]/div/input")).isSelected());

	}

}
