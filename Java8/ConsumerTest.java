package Java8;

//consumer is functional interface it has only one method 
// And forEach method accepts consumer interface implementation.
//and it is used when we want to operate or consume objects

import java.util.ArrayList;
import java.util.function.Consumer;

public class ConsumerTest {

	public static void main(String[] args) {
	ArrayList<Integer> arr = new ArrayList<Integer>();
	arr.add(1);
	arr.add(2);
	arr.add(3);
	arr.add(4);
	arr.add(5);
	arr.add(6);
	
	Consumer<Integer> con =(Integer t)->//lambda expression
			System.out.println(t);
	
	arr.forEach(con);	
	
	Consumer<String> str = (String s)->
			System.out.println(s+" is best");

	Consumer<String> str1 = (String s)->
			System.out.println(s+" is positive");
			
	str.andThen(str1).accept("priya");//used andthen menthod to chain objects

	}

};
