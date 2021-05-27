package Corejava;
// garbage collector program
public class Test
{
	static int id=0;
	public Test()
	{
		id++;
	}
    public void show() {
		System.out.println(id);
	}

	public static void main(String[] args) throws InterruptedException
    {
        Test t1 = new Test();
        t1.show();
        Test t2 = new Test();
       
        t2.show();
        	{
        		 Test t5 = new Test();
        		 t5.show();
        		 Test t6 = new Test();
        		 
        		 t6.show();
        	     t5=t6=null;
        	     System.gc(); 
                 System.runFinalization();  
                 t5.show();
        	}
    
     }
      
    @Override
    protected void finalize() throws Throwable
    {
        System.out.println("Garbage collector called");
    }
}