package datepicker;

import java.util.Calendar;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Calender {

	
	static int targetDay =0,
			targetMonth =0,
			targetYear =0;
	
	static int CurrentDay =0,
			CurrentMonth =0,
			CurrentYear =0;
	static int jumpMonthsBy=0;
	static boolean increment=true;
	
	public static void main(String[] args) {
		

		
/*	target date, month,year
		curent date, month, year
		jump to required date */
	
		String dateToSet="18/07/2021";
		getCurrentDateMonthAndYear();
		System.out.println(CurrentDay+"    "+CurrentMonth+"   "+CurrentYear);
		GetTargetDateMonthAndYear(dateToSet);
		System.out.println(targetDay+"     "+targetMonth+"    "+targetYear);
		
		
		

	}
	
	public static void getCurrentDateMonthAndYear()
	{
		Calendar cal=Calendar.getInstance();
		CurrentDay= cal.get(Calendar.DAY_OF_MONTH);
		CurrentMonth= cal.get(Calendar.MONTH)+1;
		CurrentYear= cal.get(Calendar.YEAR);
		
		
	}
	public static void GetTargetDateMonthAndYear(String dateString)
	{
		
		int firstIndex=dateString.indexOf("/");
		int lastIndex=dateString.lastIndexOf("/");
		String day=dateString.substring(0, firstIndex);
		targetDay=Integer.parseInt(day);
		
		String month=dateString.substring(firstIndex+1, lastIndex);
		targetMonth=Integer.parseInt(month);
		
		String year=dateString.substring(lastIndex+1,dateString.length());
		targetYear=Integer.parseInt(year);
		
	}

}
