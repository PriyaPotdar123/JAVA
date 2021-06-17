package Java8;
import java.util.*;
import java.util.stream.*;
  // yess we can convert arrays into stream by using method Arrays.stream() and also whith Stream.of()
public class ArraystoStream {

	    public static void main(String[] args)
	    {
	    	
	    	String[] arr1 = { "test", "priya", "apple" };
		       
		    Stream<String> stm1 = Stream.of(arr1);
		  
            stm1.forEach(str -> System.out.print(str + " \n")); 
		        
	        int arr[] = { 1, 2, 3, 4, 5 };
	  
	        IntStream stm = Arrays.stream(arr);
	  
	        stm.forEach(a -> System.out.print(a + " \n"));
	        
	      
	   }	
}
