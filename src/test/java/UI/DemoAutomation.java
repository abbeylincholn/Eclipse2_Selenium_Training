package UI;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoAutomation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// the system is to configure the webdriver, manual setup but better to use maven dependency 
//		System.setProperty("WebDriverManager.chromedriver", "C:\\Webdrivers\\chromedriver.exe");
//		ChromeDriver driver = new ChromeDriver();
		
//		System.setProperty("WebDriverManager.firefoxdriver", "C:\\Webdrivers\\firefoxdriver.exe");
//		FirefoxDriver driver = new FirefoxDriver();
		
		
//		System.setProperty("WebDriverManager.edgedriver", "C:\\Webdrivers\\edgedriver.exe");
//		EdgeDriver driver = new EdgeDriver();		
		
		//maven method, just use the 
		
		WebDriverManager.chromedriver();	
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		

	}

}
