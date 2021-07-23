package assignement1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment {

	public static void main(String[] args) {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		System.out.println("Browser launch");
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		WebElement searchbox=driver.findElement(By.name("q"));
		searchbox.sendKeys("way2Automation");
		System.out.println("Elements searched");
		searchbox.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//h3[@class=\"LC20lb DKV0Md\" ] [1]")).click();
		System.out.println("clicked on way 2 automation");
		List<WebElement> links= driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		for(WebElement link:links)
		{
			
			System.out.println(link.getAttribute("href"));
		}
		
		
		

	}

}
