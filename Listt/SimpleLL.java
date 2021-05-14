package Listt;
import java.util.*;

public class SimpleLL {

	public static void main(String[] args) {
		
		LinkedList<String> l1= new LinkedList<String>();
		
		l1.add("Priya");
		l1.add("Anantkumar");
		l1.add("Potdar");
		
		System.out.println(l1);
	
		LinkedList<String> l2=new LinkedList<String>();
		
		l2.add("potdar");
		l2.add("Anantkumar");
		l2.add("priya");
		l1.addAll(l2);
		
		System.out.println("\n"+l1);
		l1.remove(0);
		
		System.out.println("\n"+l1);
		l1.remove();
		
		System.out.println("\n"+l1);
		
		l1.descendingIterator();
		
		System.out.println("\n"+l1);
		
		System.out.println("\n"+l1.contains("Priya"));
		
		System.out.println("\n"+l1.peek());
	}

}


/*[Priya, Anantkumar, Potdar]

[Priya, Anantkumar, Potdar, potdar, Anantkumar, priya]

[Anantkumar, Potdar, potdar, Anantkumar, priya]

[Potdar, potdar, Anantkumar, priya]

[Potdar, potdar, Anantkumar, priya]

false

Potdar
*/
