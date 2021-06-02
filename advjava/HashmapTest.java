package advjava;

import java.util.HashMap;

public class HashmapTest {

	 public static void main(String[] args){
	      HashMap<Integer, String> hm = new HashMap<Integer, String>();
	      hm.put(12, "John");
	      hm.put(2, "Smith");
	      hm.put(7, "Peter");
	      hm.put(12, "Smith");
	      System.out.println(hm);
	 }
}
