package Java8;

import java.time.LocalDate;
import java.time.Period;

public class PeriodTime {

	public static void main(String[] args) {
		Period time = Period.of(1999,9,22);
		Period timeparse = Period.parse("P1998Y1M20D");
		Period daysparse = Period.parse("P120D");
		Period days = Period.ofDays(365);
		Period ofyear = Period.ofYears(7);
		Period ofmonth = Period.ofMonths(12);
		
		System.out.println(time);
		System.out.println(timeparse);
		System.out.println(days);
		System.out.println(ofyear);
		System.out.println(ofmonth);
		System.out.println(daysparse);
		
	}

}
