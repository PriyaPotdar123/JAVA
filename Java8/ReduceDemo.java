package Java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReduceDemo {

	public static void main(String[] args) 
	{
	 List<Integer> arr = Arrays.asList(1,2,3,4,5,6);
	 
	 Integer a= arr.stream().reduce(1,(c,e) -> c+e);
	 System.out.println(a);

	}

}
