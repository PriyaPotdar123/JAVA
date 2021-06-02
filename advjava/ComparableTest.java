package advjava;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableTest {

	public static void main(String[] args) {
		ArrayList<Laptop> lap = new ArrayList<Laptop>();
		
		lap.add(new Laptop(1200,"longbook","asus"));
		lap.add(new Laptop(400,"macbook","apple"));
		lap.add(new Laptop(800,"ideapad","lenovo"));
		lap.add(new Laptop(1600,"egal","acer"));
		
		for(Laptop l:lap)
		{
			System.out.println(l.toString());
		}
		
		Collections.sort(lap);
		System.out.println("\n");
		System.out.println("After sorting using comparable interface With Ram \n");
		for(Laptop l:lap)
		{
			System.out.println(l.getBrand()+" "+l.getName()+" "+l.getRam());
		}
	}

}
