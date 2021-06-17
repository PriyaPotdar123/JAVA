package Java8;

import java.time.LocalDateTime;
import java.util.Random;
import java.util.function.Supplier;

//we use supplier interface whenever we want to supply some thing whithout taking as argument

public class SupplierTest {

	public static void main(String[] args) {
		Supplier<LocalDateTime> sup = ()-> LocalDateTime.now();
		
		System.out.println(sup.get());// will print localdate time
		
		
		Supplier<Double> sup1 = ()-> Math.random();
		
		System.out.println(sup1.get());// will print random values
		
		
	}

}
