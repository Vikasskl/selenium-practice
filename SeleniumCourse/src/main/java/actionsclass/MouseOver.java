package actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseOver {

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
		WebElement ele=driver.findElement(By.linkText("MANUAL TESTING"));
		Actions ac=new Actions(driver);
		ac.moveToElement(ele).perform();
		
		/*WebDriverWait wait = new WebDriverWait(driver, 5);
		WebElement element =wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("MANUAL TESTING")));
		// element.click(); */
		driver.findElement(By.xpath("//*[@id=\"navbar-collapse-1\"]/ul/li[6]/ul/li[2]/a")).click();

	}

}
