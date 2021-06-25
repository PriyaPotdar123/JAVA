package Java11;

import java.util.List;
import java.util.stream.Collectors;


public class Methods_java11 {

	public static void main(String[] args) {
	  String str = "java11 ";
	  String str1 = " ";
	  String str2 = " jdk ";
	  String str3 = "national\ngeographic";
	  
	  System.out.println(str2.strip());
	  //"jdk"
	  
	  System.out.println(str2.stripLeading());
	  //"jdk "
	  
	  System.out.println(str2.stripTrailing()+"\n");
	  //" jdk"
	  
	  System.out.println(str.repeat(3)+"\n");
	  
	  System.out.println(str.isBlank());
	  System.out.println(str1.isBlank());
	  System.out.println("\n");
	  
	  System.out.println(str3);
	  List<String> lines = str3.lines().collect(Collectors.toList());
	  System.out.println(lines);
	}

}
