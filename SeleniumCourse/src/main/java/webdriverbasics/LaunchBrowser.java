package webdriverbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser {

	public static void main(String[] args) {
		
		
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		String title=(driver.getTitle());
		System.out.println("The title is:" +title);
		System.out.println(title.length());
		driver.quit(); // kill the entire page which is opend by the code
	//	driver.close();// close the current page only

	}

}
