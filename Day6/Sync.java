package training.com.omar.Day6;

class Counter{
	int count;
	
	public synchronized void incrementer() {
		
		count++;
	}
}



public class Sync {

	public static void main(String[] args) throws Exception {
	
		
		final Counter c = new Counter();
		
		
		Thread t1 = new Thread(new Runnable()
				{
					public void run()
					{
						for(int i =0; i<=99; i++)
						{
							c.incrementer();
						}
					}
				});
		
		Thread t2 = new Thread(new Runnable()
		{
			public void run()
			{
				for(int i =0; i<=99; i++)
				{
					c.incrementer();
				}
			}
		});
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println("Counter Value: " + c.count);
	}

}
