package javaBasics;

import java.text.SimpleDateFormat;
import java.util.Date;;

public class DateDemoClass {

	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now);
		
		SimpleDateFormat dnow = new SimpleDateFormat("E yyyy.MM.dd '-' hh:mm:ss a zzz");
		System.out.println(dnow.format(now));
		
		//display time and date
		String str = String.format("Current Date/Time: %tc", now);
		System.out.printf(str);
	
		//display time and date using $
		System.out.printf("$");
		
		
		//display formatted date using <
		
	
	}
	

}
