package Java8;

import java.time.Duration;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class DurationTime {

	public static void main(String[] args) {
		Duration time = Duration.ofDays(55);
		System.out.println("Hours :" + time);
		
		Duration days = Duration.ofNanos(999);
		System.out.println(days);
		
		Duration hrs = Duration.between(LocalTime.MIDNIGHT,LocalTime.NOON);
		long second = (hrs.getSeconds());
		
		long min=(hrs.get(ChronoUnit.SECONDS))/  60;
		
		System.out.println(hrs);
		
		System.out.println("In the given Duratuion Hours are " + hrs + " and Seconds are "+ second);
		System.out.println("and minuits are " + min);
		

	}

}
