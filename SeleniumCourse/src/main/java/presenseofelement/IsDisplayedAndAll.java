package presenseofelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IsDisplayedAndAll {

	public static void main(String[] args) {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.wikipedia.org/");
		//System.out.println(driver.findElement(By.xpath("//i[@class=\"sprite svg-search-icon\"]")).isDisplayed());
		System.out.println(driver.findElement(By.xpath("//i[@class=\"sprite svg-search-icon\"]")).isDisplayed());
		System.out.println(driver.findElement(By.xpath("//i[@class=\"sprite svg-search-icon\"]")).isEnabled());
		System.out.println(driver.findElement(By.xpath("//i[@class=\"sprite svg-search-icon\"]")).isSelected());
		
		driver.close();

	}

}
