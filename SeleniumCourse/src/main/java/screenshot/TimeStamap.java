package screenshot;

import java.util.Date;

public class TimeStamap {

	public static void main(String[] args) {
		
		Date d=new Date();
		System.out.println(d.toString().replace(":", "_").replace(" ", "_") +".jpg");

	}

}