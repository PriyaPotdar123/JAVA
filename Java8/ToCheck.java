package Java8;


interface Test
{
	void show(int i);
}
 
 class ToCheck 
 {

	public static void main(String[] args)
	{
		
	Test obj =(i) -> System.out.println("Show has been Called and Squar of given number is : "+i*i );
	// just to show lambda expression
	
	obj.show(6);
	
	}
	
 }