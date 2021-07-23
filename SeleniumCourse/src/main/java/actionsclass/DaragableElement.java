package actionsclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DaragableElement {

	public static void main(String[] args) {
		
		
		
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		driver.manage().window().maximize();
		System.out.println("Browser launch");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.switchTo().frame("demo-frame lazyloaded");
		
		WebElement drag= driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
		WebElement droapable= driver.findElement(By.xpath("//div[@id='trash']"));
		
		Actions ac=new Actions(driver);
		ac.dragAndDrop(drag, droapable).perform();
		
		driver.quit();

	}

}
