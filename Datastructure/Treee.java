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
	   
	}  
}
