package handlingwindowsandtab;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingWindowsAndTab {

	public static void main(String[] args) {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		
		
		//driver.get("https://www.globalsqa.com/demo-site/frames-and-windows/#iFrame");
		driver.get("https://www.hdfcbank.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//button[@class='btn btn-primary login-btn hide-in-mobileApp ng-scope']")).click();
		driver.findElement(By.xpath("//a[@class='btn-default register-url']")).click();
		
		System.out.println( driver.getTitle());
		

	}

}
