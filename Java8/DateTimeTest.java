package Java8;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DateTimeTest {

	public static void main(String[] args) {
		LocalDateTime ld = LocalDateTime.now();
		System.out.println(ld);
		
		ZonedDateTime zld= ZonedDateTime.now();
		System.out.println(zld);
	}

}
