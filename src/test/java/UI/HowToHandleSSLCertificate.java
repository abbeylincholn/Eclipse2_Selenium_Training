package UI;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HowToHandleSSLCertificate {
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver();


		// Global profile
		DesiredCapabilities dc = new DesiredCapabilities();
		//dc.setAcceptInsecureCerts(true);
		dc.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		//dc.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);

		ChromeOptions cOptions = new ChromeOptions();
		cOptions.merge(dc);

		WebDriver driver = new ChromeDriver(cOptions);
		driver.get("https://expired.badssl.com/");
		driver.manage().window().maximize();
	}

}
