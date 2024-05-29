package UI;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HowToHandleAuthenticationPopup {

	public static String username = "admin"; // Reading thing this from external XLS or CSV
	public static String password = "admin"; // Reading thing this from external XLS or CSV

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver();
		ChromeDriver driver = new ChromeDriver();
		// driver.get("admin:admin@https://the-internet.herokuapp.com/basic_auth"); //
		// this is normal direct

		driver.get("https://" + username + ":" + password + "@the-internet.herokuapp.com/basic_auth"); // if reading
																										// from external
																										// file

		driver.manage().window().maximize();

	}

}
