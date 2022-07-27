package training.com.omar.Day6;

class Even implements Runnable{
	public void run() {
		for (int i = 1; i <= 10; i++)
			if(i%2==0)
				System.out.println(i);
	}
	
}

class Odd implements Runnable{
	public void run() {
		for (int i = 1; i <= 10; i++)
			if(i%2!=0)
				System.out.println(i);
	}
	
}

public class TwoThread {

	public static void main(String[] args) {
		
		Runnable r1 = new Even();
		
		Runnable r2 = new Odd();
		
		Thread t1 = new Thread(r1);
		
		Thread t2 = new Thread(r2);
		
		t1.start();
		t2.start();

	}

}
