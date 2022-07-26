package training.com.omar.Day5;

public class TryCatchEx {

	public static void main(String[] args) {
		
		//try catch for undefined number for int
		
		int x = 3;
		int y = 0;
		
		try {
		int answer = x/y;
		}
		
		catch (ArithmeticException e){
			
			System.out.println("Exception handling for dividing ");
		}
		
	
		
		
	}

}
