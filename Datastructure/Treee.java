package Datastructure;
import java.util.*;  
public class Treee {

	 public static void main(String args[])
	 {
	  TreeSet<String> al=new TreeSet<String>();  
	  
	  al.add("Ravi");  
	  al.add("sanjay");  
	  al.add("Ravi");  
	  al.add("Ajay");  
	  al.add("vijay");
	  al.add("abhi");
	  al.add("vaibhav");
	  
	  Iterator<String> itr=al.iterator();  
	  
		  while(itr.hasNext())
		  {  
		   System.out.println(itr.next());  
		  }  
		  System.out.println("\n");
	  Iterator<String> i= al.descendingIterator();  
	       while(i.hasNext())  
	       {  
	        System.out.println(i.next());  
	       }   
	  
	 /* System.out.println("SubSet: "+al.subSet("ravi", "abhi"));    */
	  
	  System.out.println(al);
	  System.out.println(al.higher("abhi"));
	  System.out.println(al.lower("vijay"));
	  System.out.println(al.last());
	  System.out.println(al.contains("abhi"));
	  System.out.println(al.first());
	  
	  System.out.println("greater value : "+al.pollFirst());  
	  System.out.println("lowest value : "+al.pollLast());
	  
	  System.out.println(al);
	  System.out.println(al.floor("priya"));
	  System.out.println(al.size());
	}  

}