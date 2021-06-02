package advjava;
import java.util.*;
public class Collectionstest {

	public static void main(String[] args) {
		List<String> arr = new ArrayList<String>(10); 
		arr.add("A");
		arr.add("B");
		arr.add("D");
		arr.add("E");
		arr.add("C");
		
		List<String> arr1 = new ArrayList<String>(20); 
		arr1.add("1");
		arr1.add("2");
		arr1.add("3");
		arr1.add("4");
		arr1.add("5");
		
		System.out.println(arr);
		Collections.sort(arr);
		System.out.println("After sorting");
		System.out.println(arr);
		
		Collections.addAll(arr1, "Y");
		System.out.println("After adding");
		System.out.println(arr1);
		
		Collections.copy(arr1, arr);
		System.out.println("After coping");
		System.out.println(arr1);
		
		System.out.println(arr1.size());
	}

}
