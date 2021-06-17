package Java8;

//function interface operates on two types of arguments it takes input type
//and give output as given output type

import java.util.function.Function;

public class Functiontest {

	public static void main(String[] args) 
	{
	
	//taking string as an input type and integer as an output type and returning length of string
		
	Function<String,Integer> fun =(String s) -> s.length();
	System.out.println(fun.apply("Tiruanantpuram"));
	
	
	//taking integer as input and string as an output type and returning odd and even numbers
	
	Function<Integer,String> fun1= (Integer t) ->
				{
					if(t%2==0)
						return "is even";
					else		
						return "is odd";
				};
	System.out.println(fun1.apply(5));	
	
	}

}
