package UI;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HowToPrintAllLinksOfAWebpage {
	public static void main(String[] args) throws InterruptedException {

/*		WebDriverManager.chromedriver();	
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.sugarcrm.com/uk/request-demo/");
		driver.manage().window().maximize();
		
		
		List<WebElement> AllLinksTags = driver.findElements(By.tagName("a"));
		System.out.println("Total Link Tags are: "+AllLinksTags.size());
		
		for(int i=0; i<AllLinksTags.size();i++)
		{
			System.out.println("Links on page are: "+AllLinksTags.get(i).getAttribute("href"));
			System.out.println("Links on page are: "+AllLinksTags.get(i).getAttribute("id"));
			System.out.println("Links on page are: "+AllLinksTags.get(i).getText());
		}  */ 
		
		
		WebDriverManager.chromedriver();	
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.sugarcrm.com/uk/request-demo/");
		driver.manage().window().maximize();
		
		
		List<WebElement> AllLinksTags = driver.findElements(By.tagName("option"));
		System.out.println("Total Link Tags are: "+AllLinksTags.size());
		
		for(int i=0; i<AllLinksTags.size();i++)
		{
			System.out.println("Links on page are: "+AllLinksTags.get(i).getAttribute("value"));
			System.out.println("Links on page are: "+AllLinksTags.get(i).getText());
		}  
		
		
		

	}

}
