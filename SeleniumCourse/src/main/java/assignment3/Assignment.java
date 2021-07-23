package assignment3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment {
	
	public static int ArithOperation(int a, char oper, int b)
	{
		
		if(oper=='+')
		{
			int c=a+b;
			return c;
		}else if(oper=='-') {
				return a-b;
			}else
			{
				return a*b;
			}
		}
	
	
	
	

	public static void main(String[] args) {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://timesofindia.indiatimes.com/poll.cms");
		
		/*
		 * String[] arrstr=arith.split(" ");

int operand1= Integer.parseInt(arrstr[0]);

int operand2= Integer.parseInt(arrstr[2]);

char operand3= arrstr[1].charAt(0);

int ArithValue=ArithOperation(operand1,operand3,operand2);

driver.findElement(By.id("mathq2")).sendKeys(String.valueOf(ArithValue));
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		
		String arith=driver.findElement(By.id("mathq2")).getText();
		System.out.println(arith);
		String[] arrstr=arith.split(" ");
		int operand1= Integer.parseInt(arrstr[0]);
		int operand2= Integer.parseInt(arrstr[2]);
		char operand3= arrstr[1].charAt(0);
		int ArithValue=ArithOperation(operand1,operand3,operand2);
		
		driver.findElement(By.id("mathq2")).sendKeys(String.valueOf(ArithValue));
		
		System.out.println(ArithValue);

	}

}
