package Datastructure;
import java.util.*;
public class Hashtablee {

	public static void main(String[] args) {
	
        Hashtable<Integer, String> ht1
            = new Hashtable<Integer, String>();
  
        
        Hashtable<Integer, String> ht2
            = new Hashtable<Integer, String>();
  
        
        	ht1.put(1, "one");
        	ht1.put(2, "two");
        	ht1.put(3, "three");
  
        	ht2.put(4, "four");
        	ht2.put(5, "five");
        	ht2.put(6, "six");
  
      
        System.out.println("Mappings of ht1 : " + ht1);
        System.out.println("Mappings of ht2 : " + ht2);
        
        System.out.println("Size of map is:- " + ht1.size());
        
        System.out.println(ht1.containsKey(1));
        
	        if(ht1.containsKey(1))
	        {
	        	System.out.println(ht1.get(1));
	        }
        
		System.out.println("initial ht1"+ht1);
			ht1.put(1, "ONE");
		System.out.println("final ht1");
		System.out.println(ht1);
		
			ht1.put(4, "FOUR");
		System.out.println(ht1);
		
			ht1.remove(1);
		System.out.println(ht1);
		
			ht1.putAll(ht2);
		System.out.println(ht1);
	}

}
