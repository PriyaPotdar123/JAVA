package Corejava;

public class Multipalcatches {

	public static void main(String[] args) {
		int i=5;
		int j=0;
		try
		{
			int c = i/j;
		}
		catch(IndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
