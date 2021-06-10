package MultiThreding;

public class StartRun_test extends Thread{
	public void run()
	{
		System.out.println("Current thred is = "+Thread.currentThread().getName());
		System.out.println("Thread is running.......");
	}

	public static void main(String[] args) {
		StartRun_test th = new StartRun_test();
		th.start();
		//th.run();
	}

}
