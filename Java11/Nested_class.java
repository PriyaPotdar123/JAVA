package Java11;

public class Nested_class {
	private int var;
	private void showw()
	{
		System.out.println("outter class showw has called");
	}
	
	class inner
	{
		public void display()
		{
			var=10;
			System.out.println("inner class dispaly has called and var value is :"+var);
			showw();
		}
	}

 public static void main(String[] args) {
	Nested_class  out = new Nested_class();
	out.showw();
	Nested_class.inner in = out.new inner();
	in.display();
	
	System.out.println(Nested_class.class.getNestMembers());
	System.out.println(inner.class.getNestHost());
	System.out.println(Nested_class.class.isNestmateOf(inner.class));
}	
}