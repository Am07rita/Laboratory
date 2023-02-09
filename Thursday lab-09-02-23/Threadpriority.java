package Thursdaylab;
public class ThreadDemoExample extends Thread {
	public void run() 
	{
		for(int i=1;i<=5;i++) 
		{
			try {
				Thread.sleep(600);
			}
			catch(InterruptedException e)
			{
				System.out.println(e.getMessage());
			
		}
		System.out.println(i+"Thread is running!!"+Thread.currentThread().getName()
				+"Priority: "+Thread.currentThread().getPriority());
	 }
	}
	public static void main(String[] args) {
		ThreadDemoExample t1=new ThreadDemoExample();//new state
		ThreadDemoExample t2=new ThreadDemoExample();
		ThreadDemoExample t3=new ThreadDemoExample();
		ThreadDemoExample t4=new ThreadDemoExample();
		
		//t1.start();
		//t1.start();
		t1.setName("Thread-1");
		t2.setName("Thread-2");
		t3.setName("Thread-3");
		t4.setName("Thread-4");
		
		t1.setPriority(NORM_PRIORITY);//5
		t2.setPriority(MAX_PRIORITY);//10
		t3.setPriority(MIN_PRIORITY);//1
		t4.setPriority(7);//7
		
		t1.start();//runnable
		t2.start();
		t3.start();
		t4.start();
		}

}
