package waitstatement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWait {

	public static void main(String[] args) {
		
		
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		System.out.println("Launch the Browser");
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		System.out.println("Login completed");
		
		driver.findElement(By.id("welcome")).click();
		WebDriverWait wait= new WebDriverWait(driver, 5);
		//wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Logout"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Logout"))).click();
		System.out.println("Logout");
		
	}

}
