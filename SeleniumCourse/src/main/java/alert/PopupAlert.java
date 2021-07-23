package alert;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PopupAlert {

	public static void main(String[] args) throws AWTException {
		

		
				WebDriver driver;
				WebDriverManager.chromedriver().setup();
				driver=new ChromeDriver();
				driver.manage().window().maximize();
				
				driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				driver.findElement(By.name("proceed")).click();
//				 Robot robot = new Robot();
//				    robot.keyPress(KeyEvent.VK_SPACE);
//				    robot.keyRelease(KeyEvent.VK_SPACE);
				    
				Alert at=driver.switchTo().alert();
				at.accept();
				System.out.println("completed");
			
				System.out.println(at.getText());
				System.out.println("completed");
				driver.close();
				
				
				
				}

	


	}


