package advjava;

import java.util.*;

public class GenericTest {

	public static void main(String[] args) {
		List list = new ArrayList();    
		list.add("hello"); 
		list.add("priya");
		list.add(1);
		System.out.println(list);
		
		List<String> list1 = new ArrayList<String>();    
		list1.add("hello");  
		//list1.add(1);
		System.out.println(list.get(1));//no need to use typecasting  
		System.out.println(list1);

	}

}
// when we use generics with some type then it willl restrict other types to add in.
//There is no need to typecast the object.