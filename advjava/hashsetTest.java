package advjava;

import java.util.HashSet;

public class hashsetTest {

		public static void main(String[] args){
		      HashSet<String> hs = new HashSet<String>();
		      hs.add("priya");
		      hs.add("potdar");
		      hs.add("cuelogic");
		      System.out.println("Before adding duplicate values " + hs);
		      hs.add("priya");
		      hs.add("potdar");
		      System.out.println("\nAfter adding duplicate values " + hs);
		      hs.add(null);
		      hs.add(null);
		      System.out.println("\nAfter adding null values" + hs);
		   }

}
