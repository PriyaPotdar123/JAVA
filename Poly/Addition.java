package Poly;

public class Addition {
	
	public int add(int num1,int num2)
	{
		return num1+num2;
	}
	public int add(int num1,int num2,int num3)
	{
		return num1+num2+num3;
	}

	public static void main(String[] args) 
	{
		Addition ad= new Addition();
		System.out.println("addition of two numbers is "+ad.add(13, 7));
		System.out.println("addition of three numbers is "+ad.add(1, 2, 3));

	}

}
