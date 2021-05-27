package Corejava;

import java.io.*;

// Try Catch Finally block
public class TrycatchTest {

	public static void main(String[] args) throws IOException  {
		
		BufferedReader br = null;
		try
		{
			String s;
			br = new BufferedReader(new InputStreamReader(System.in));
			s= br.readLine();
			System.out.println(s);
		}
		catch(Exception e)
		{
			System.out.println("Io exception");
			System.out.println(e);
		}
		finally
		{
			System.out.println("finally has been called");
			br.close();
		}
	}

}
