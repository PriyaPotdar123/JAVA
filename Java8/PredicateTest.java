package Java8;


import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;




public class PredicateTest {
	public static void main(String[] args) {
		
	Predicate<Integer> obj = (t) ->{
					if(t%2==0)
					return true;
					else 
					return false;
				};
				
		System.out.println(obj.test(10)+"\n");
	
		 List<String> list = Arrays.asList("priya","siya","om","shree","piu","pihu");
		
		 list.stream().map(String::toUpperCase).collect(Collectors.toList()).forEach(System.out::println);
		 // here used Map method to convert the string to upper case
		 
		 System.out.println("\n");
		 list.stream().filter(str ->str.length()<4).collect(Collectors.toList()).forEach(System.out::println);
}
}
