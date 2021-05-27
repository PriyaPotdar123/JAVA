package Corejava;

import java.io.*;
import java.util.*;
// Try Catch finally Block
// user defined exception class Myexception
public class Exceptiontest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i;
		i=sc.nextInt();
		
		try {
				if(i<10)
				{
					throw new Myexception("Errrrorrrrr");
				}
		}
		catch(Myexception e)
		{
					System.err.println(e);
		}
		finally
		{
					System.out.println("finally has been called");
					sc.close();
		}
	}

}
class Myexception extends Exception
{
	public Myexception(String msg)
	{
		super(msg);
	}
}

