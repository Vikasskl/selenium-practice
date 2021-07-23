package dropdownlist;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingDropDown {

	public static void main(String[] args) {
		WebDriver driver;
		//WebDriverManager.chromedriver().setup();
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
		//driver.get("http://www.way2automation.com/");
		driver.get("https://www.wikipedia.org/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	//	WebElement dropdown= driver.findElement(By.id("searchLanguage"));
		Select sc=new Select(driver.findElement(By.id("searchLanguage")));
	//	sc.selectByVisibleText("Galego");
		sc.selectByIndex(12);
	//	sc.selectByValue("hi");
		
		driver.close();
		
		

	}

}
