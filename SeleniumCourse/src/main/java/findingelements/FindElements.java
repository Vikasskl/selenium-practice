package findingelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElements {

	public static void main(String[] args) {
		
		WebDriver driver;
		//WebDriverManager.chromedriver().setup();
		WebDriverManager.firefoxdriver().setup();
		
		driver=new FirefoxDriver();
		
//		driver.get("http://gmail.com");
//		System.out.println(driver.getTitle());
//		
//		
//		/*
//		 * There are 8 major locators which we have in selenium
//		 * name , id, classname, cssSelectors, linktext, partial link text,xpath
//		 */
//	
//	//	WebElement username= driver.findElement(By.id("identifierId"));
//		WebElement username= driver.findElement(By.cssSelector("#identifierId"));
//		username.sendKeys("mishravikas70489@gmail.com");
//		driver.findElement(By.className("VfPpkd-vQzf8d")).click();
//		driver.findElement(By.className("password")).sendKeys("Anju@123");
		
	//	driver.close();

	}

}
