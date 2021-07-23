package handlingmultipleelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleLinksPrint {

	public static void main(String[] args) {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.wikipedia.org/");
		driver.manage().window().maximize();
		List<WebElement> Links=driver.findElements(By.tagName("a"));
		System.out.println(Links.size());
		for(WebElement links:Links)
			
		{
			System.out.println(links.getText());
			System.out.println(links.getAttribute("href"));
		}
		
		driver.close();
	}
	
	
	
}
		
		
		
	
	

	
