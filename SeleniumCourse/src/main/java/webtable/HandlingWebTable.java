package webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingWebTable {

	public static void main(String[] args) {

		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		driver.manage().window().maximize();
		List<WebElement> rows=driver.findElements(By.xpath("//th[@scope='row']"));
		List<WebElement> col=driver.findElements(By.xpath("//th[@scope='col']"));
		System.out.println("total rows:" + rows.size());
		System.out.println("total col: "+ col.size());
	/*	for(WebElement rowsA:rows)
		{
			System.out.println(rowsA.getText());
			
			for(WebElement colB:col)
			{
				System.out.println(colB.getText());
			}
		} */
		
		
		

	}

}
