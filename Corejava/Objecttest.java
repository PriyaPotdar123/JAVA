package Corejava;

class Test1 implements Cloneable
{
	public int x=1;
	public int y=3;
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	
}
public class Objecttest{
	 
	public static void main(String[] args) throws CloneNotSupportedException {
		Test1 ob = new Test1();
		Test1 ob1 = ob;
		System.out.println(ob1.x+" "+ob1.y);
		System.out.println(ob.x+" "+ob.y);
		Test1 ob3 = new Test1();
		ob3.x=100;
		System.out.println("After change ");
		System.out.println(ob1.x+" "+ob.y);
		System.out.println(ob3.x+" "+ob3.y);
		
		System.out.println("After using clone method");
		Test1 ob4=(Test1)ob.clone();
		System.out.println(ob4.x+" "+ob4.y);
		ob4.x=100;
		System.out.println(ob4.x+" "+ob4.y);
	}

}// deep copy shallow copy
