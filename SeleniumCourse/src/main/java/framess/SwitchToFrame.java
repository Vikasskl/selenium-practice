package framess;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwitchToFrame {

	public static void main(String[] args) {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		
		
		driver.get("https://www.globalsqa.com/demo-site/frames-and-windows/#iFrame");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.switchTo().frame("globalSqa");
		driver.findElement(By.id("mobile_menu_toggler")).click();
		List<WebElement> fram= driver.findElements(By.tagName("iframe"));
		System.out.println(fram.size());
		for(WebElement framm:fram)
			System.out.println(framm.getAttribute("id"));
		driver.switchTo().defaultContent();
		
		
//	//	google_esf
//		WebElement frame= driver.findElement(By.xpath("//input[@id='s']"));
//		
//		
//		frame.sendKeys("Automation");
		//driver.quit();
		System.out.println("done");
		

	}

}
