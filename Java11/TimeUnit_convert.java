package Java11;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

public class TimeUnit_convert {

	public static void main(String[] args) {
		long days = 50;
		TimeUnit time = TimeUnit.DAYS;
		System.out.println(time.convert(days,TimeUnit.HOURS));
	
	}
	

	
}
