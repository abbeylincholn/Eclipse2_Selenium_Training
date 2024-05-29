package UI;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HowToTakeScreenShot {
	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriverManager.chromedriver();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com.au");
		driver.manage().window().maximize();

		// in order to have diff names for screenshots, then date below needs to be done
		// to have diff files capture diff time
		Date currentDate = new Date();
		// System.out.println(currentDate);
		String screenShotFileName = currentDate.toString().replace(" ", "-").replace(":", "-");
		System.out.println(screenShotFileName);

		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotFile, new File(".//screenshot/" + screenShotFileName + ".png"));

	}

}
