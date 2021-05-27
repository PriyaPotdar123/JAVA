package Corejava;
import java.io.*;

//checked exception handling example

public class Test2 {
	 public static void main(String[] args) throws IOException 
	 {
		 FileReader file = new FileReader("git.txt");
		 
	     BufferedReader fileInput = new BufferedReader(file);

	     System.out.println(fileInput.readLine());
	          
	     fileInput.close();
	 }
}


//example of unchecked exception
class Main {
public static void main(String args[]) {
	int x = 0;
	int y = 10;
	int z = y/x;
}
}
