package screenshot;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenshotDemo {
	static WebDriver driver;
	
	public static void capturescreenshot() throws IOException
	{
		
		Date d=new Date();
		String Filename=(d.toString().replace(":", "_").replace(" ", "_") +".jpg");
		 File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	        
	        //Copy the file to a location and use try catch block to handle exception
	      
	           // FileUtils.copyFile(screenshot, new File("C:\\screenshots.png"));
	            FileUtils.copyFile(screenshot, new File(".//screenshot//"+ Filename));
	}

	public static void main(String[] args) throws IOException {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		 //navigate to url
        driver.get("https://opensource-demo.orangehrmlive.com/");
        
       
        
       //Take the screenshot
        capturescreenshot();
        
       
            driver.close();
        } 
        
        //closing the webdriver
       
    }

		

		
		
		
		
		
	


