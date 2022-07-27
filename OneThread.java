package training.com.omar.Day6;

public class OneThread extends Thread {
	
	public void run(){
	       printer();
	    }
	
	static void printer() {
		
		for (int i = 1; i <= 50; i++)
			System.out.println(i);
	}

	public static void main(String[] args) {
		
		OneThread t1 = new OneThread();
		
		t1.start();
		
		
	}

}
