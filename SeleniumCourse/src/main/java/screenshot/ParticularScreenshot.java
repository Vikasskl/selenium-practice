package screenshot;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParticularScreenshot {
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
        driver.get("https://www.google.co.in/");
        WebElement ele=driver.findElement(By.className("lnXdpd"));
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        BufferedImage fullImage=ImageIO.read(screenshot);
       Point point= ele.getLocation();
      int elewidth= ele.getSize().getWidth();
      int elehieght= ele.getSize().getHeight();
      
     BufferedImage elescreenshot= fullImage.getSubimage(point.getX(), point.getY(), elewidth, elehieght);
     ImageIO.write(elescreenshot, "jpg", screenshot);
     File screenshotlocation=new File(".//screenshot\\googlelogo.jpg");
     FileUtils.copyFile(screenshot, screenshotlocation);
        
       //Take the screenshot
        capturescreenshot();
        
       
            driver.close();
        } 
        
        //closing the webdriver
       
    }

		

		
		
		
		
		
	


