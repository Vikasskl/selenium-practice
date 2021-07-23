package handlingmultipleelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingMultipleElements {

	public static void main(String[] args) {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.wikipedia.org/");
		
		WebElement dropdown= driver.findElement(By.id("searchLanguage"));
		Select sc=new Select(dropdown);
		sc.selectByVisibleText("Galego");
		//List<WebElement> values=driver.findElements(By.tagName("option"));
		List<WebElement> values=dropdown.findElements(By.tagName("option"));
		
		
		
		System.out.println("Total count of elements: " +values.size());
		for(WebElement ele: values)
			System.out.println(ele.getAttribute("lang"));
		driver.close();
		
		

	}

}
