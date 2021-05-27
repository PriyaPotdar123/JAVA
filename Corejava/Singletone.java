package Corejava;


public class Singletone{
	public static void main(String[] args)
	{
		Single x = Single.getinstance();
		//Single si = new Single();
		x.s=(x.s).toUpperCase();
		System.out.println(x.s);
	}
}