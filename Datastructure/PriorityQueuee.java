package Datastructure;
import java.util.*;

public class PriorityQueuee {

	public static void main(String[] args) {
		
		Queue<String> pq = new PriorityQueue<>();
		  
        pq.add("Priya");
        pq.add("Anantkumar");
        pq.add("Potdar");
  
        System.out.println(pq);
        pq.remove("Priya");
        
        System.out.println("After Removing " + pq);
        System.out.println(pq.peek());
  
        System.out.println("'Poll Method' " + pq.poll());
        
        System.out.println(pq.peek());
        
        pq.offer("famaly");
        System.out.println(pq);
        
       System.out.println(pq.isEmpty());
       pq.clear();
       System.out.println(pq.isEmpty());

	}
	
	/*[Anantkumar, Priya, Potdar]
			After Removing [Anantkumar, Potdar]
			Anantkumar
			'Poll Method' Anantkumar
			Potdar
			[Potdar, famaly]
			false
			true*/


}
