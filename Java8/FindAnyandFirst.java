package Java8;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;
  
public class FindAnyandFirst 
{
   public static void main(String[] args) 
	    {
	          
		    IntStream stream = IntStream.of(4, 5, 8, 10, 12, 16);
		      
		    stream = stream.filter(i -> i % 4 == 0);
	
		    OptionalInt answer1 = stream.findFirst();
		    if (answer1.isPresent()) 
		    {
		        System.out.println(answer1.getAsInt());
		    }
		    
		    //--------------------------------
		    
		    Stream<String> strstream = Stream.of("test", "priya", "apple" );
		    strstream = strstream.map(String::toUpperCase);
		    strstream = strstream.filter(string -> string.length()>4);
		    
		    Optional answer = strstream.findAny();
		    if (answer.isPresent()) 
		    {
		        System.out.println(answer.get());
		    }
		    
		 /* Optional answer2 = strstream.findFirst();
		    if (answer2.isPresent()) 
		    {
		        System.out.println(answer2.get());
		    }*/
		    
		    
	   }
}