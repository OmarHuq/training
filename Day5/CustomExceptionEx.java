package training.com.omar.Day5;

class NumException extends Exception
{
	
	public NumException() {
		
	}
	
	public NumException(String num) {
		
		super(num);
	}
}

public class CustomExceptionEx {

	public static void main(String[] args) {
		
		String name = "Omar ";
		try {
			
			if(name.contains("a"))
			{
				throw new NumException();
			}
		}
		catch(NumException one) {
			System.out.println("Caught exception"); 
			System.out.println("Hello");
		}

	}

}
