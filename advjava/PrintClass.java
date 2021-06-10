package advjava;
import java.io.File;  
import java.io.PrintWriter;  
public class PrintClass {

	    public static void main(String[] args) throws Exception
	    {  
	    	
	      PrintWriter wr = new PrintWriter(System.out);    
	      wr.write("helllooo there ..");        
	      wr.flush();  
	      wr.close();  
	      
	      PrintWriter wr1 =null; 
	      
	         wr1 = new PrintWriter(new File("Priya.txt"));  
	         wr1.write("hiiii everyone");                                                   
	         wr1.flush();  
	         wr1.close();  
	    }  
	
}
