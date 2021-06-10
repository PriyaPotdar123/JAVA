package MultiThreding;
//Ceating a thred using runnable interface 

public class UsingRunnable implements Runnable {
	public void run()
	{  
		System.out.println("thread is running...");  
		System.out.println(Thread.currentThread().getName());
	}  
		  
	public static void main(String args[])
	{  
		UsingRunnable m1=new UsingRunnable();  
		
		Thread t1 =new Thread(m1);  
		
		t1.start();  
		//t1.run();
	}  
}
/* 1.When we extend Thread class, each of our thread creates unique object and associate with it. When we 
 * implements Runnable, it shares the same object to multiple threads.
 * 
 * 2.The Java Thread itself implements a Java Runnable
 */