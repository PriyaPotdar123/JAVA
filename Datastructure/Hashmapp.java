package Datastructure;
import java.util.*;  
public class Hashmapp {

	 public static void main(String args[]){
		 
	   HashMap<Integer,String> map=new HashMap<Integer,String>();   
	   map.put(1,"Mango");  
	   map.put(2,"Apple");    
	   map.put(3,"Banana");   
	   map.put(4,"Grapes");
	   map.put(5, "chiku");
	   System.out.println(map);
	   System.out.println(map.containsKey(5));
	   System.out.println(map.get(1));
	   System.out.println(map.isEmpty());
	   map.replace(1, "Priya");
	   System.out.println(map);
	   System.out.println(map.values());
	   
	}  
	}  

