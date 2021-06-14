package Java8;

import java.time.Instant;

public class InstantTime {

	public static void main(String[] args) {
		Instant instant = Instant.now();
		System.out.println(instant);
		
		Instant now     = Instant.now();
		Instant later   = now.plusSeconds(3);
		Instant earlier = now.minusSeconds(3);
		
		System.out.println("Current moment "+now+" moment 3 sec earlier"+earlier+
				" moment 3 sec later "+later);
		Instant instant1 = Instant.now();
		System.out.println(instant1);
		
	}

}
