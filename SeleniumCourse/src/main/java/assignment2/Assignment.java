package assignment2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment {

	public static void main(String[] args) {
		//
		
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://way2automation.com/way2auto_jquery/index.php");
		driver.findElement(By.name("name")).sendKeys("Vikas");
		WebElement countryname=driver.findElement(By.name("country"));
		countryname.sendKeys("Iceland");
		Select sc=new Select(countryname);
		sc.selectByVisibleText("Iceland");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 5);
		WebElement element =wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"load_form\"]/div[1]/div[2]/input")));
		 element.click();
		driver.close();
		/*
		 *  WebDriverWait wait = new WebDriverWait(driver, 10);
    WebElement passwordElement = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Passwd")));
    passwordElement.click();
		 * 
		 * 
		 * 
		 * 
		 */
		
		//driver.findElement(By.className("button")).click();
		driver.close();
		
		
		
		
	}

}
