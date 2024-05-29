package UI;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SSLCertificateCrossBrowser {

	public static String browser = "chrome"; // External configuration -XLS, CSV
	public static WebDriver driver;

	public static void main(String[] args) {

		DesiredCapabilities handleSSLError = new DesiredCapabilities();

		if (browser.equals("chrome")) {
			WebDriverManager.chromedriver();
			handleSSLError.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);

			ChromeOptions cOptions = new ChromeOptions();
			cOptions.merge(handleSSLError);
			driver = new ChromeDriver(cOptions);

		}

		else if (browser.equals("firefox")) {
			WebDriverManager.firefoxdriver();
			handleSSLError.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);

			FirefoxOptions cOptions = new FirefoxOptions();
			cOptions.merge(handleSSLError);
			driver = new FirefoxDriver(cOptions);

		}

		else if (browser.equals("edge")) {
			WebDriverManager.edgedriver();
			handleSSLError.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);

			EdgeOptions cOptions = new EdgeOptions();
			cOptions.merge(handleSSLError);
			driver = new EdgeDriver(cOptions);

		}

		driver.get("https://cacert.com");

	}

}
