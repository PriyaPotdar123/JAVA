package Java8;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;

public class LocaldateTime {

	public static void main(String[] args) {
		
		LocalDate date = LocalDate.now();
		System.out.println(date);
		
		LocalTime time = LocalTime.now();
		System.out.println(time);
		
		LocalDate onthisday = LocalDate.of(1999, Month.JANUARY, 14);
		System.out.println(onthisday);
		
		time = LocalTime.of(3, 25, 59);
		System.out.println(time);
		
		System.out.println(onthisday+" Time was " + onthisday.atTime(time));
		
		System.out.println("This is current day and it is '" +date.getDayOfMonth()+ "' day of month");
		
		//----------------------------------
		
		System.out.println("\n");
		System.out.println("Printing a Calender of month February");
		System.out.println("\n");
		
		Month month = Month.FEBRUARY;
		LocalDate days=null;
		
		LocalDate date1 = LocalDate.of(2005,Month.FEBRUARY,1) ;
		
		int daysOfmonth= month.length(false);
		
		if(date1.isLeapYear())
		{
			daysOfmonth = month.length(false);
			
			daysOfmonth=daysOfmonth+1;
		}
		
		for(int d=0;d<daysOfmonth;d++)
		{
			days= date1.plusDays(d);
			System.out.println(days);
		}
	}

}
