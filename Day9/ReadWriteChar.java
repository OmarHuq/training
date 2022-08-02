package training.com.omar.Day9;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadWriteChar {

	public static void main(String[] args) {
		
		FileReader iFile = null;
		FileWriter oFile = null;
		
		try {
			iFile = new FileReader("C:\\Users\\Omar\\eclipse-workspace\\HW1_HCL\\src\\main\\java\\training\\com\\omar\\Day9\\TestFile.txt");
			oFile =  new FileWriter("C:\\Users\\Omar\\eclipse-workspace\\HW1_HCL\\src\\main\\java\\training\\com\\omar\\Day9\\outputtext.txt");
			
			int temp = 0;
			
			while((temp = iFile.read()) != -1) {
				oFile.write(temp);
			}
			System.out.println("Wrote to file..");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
		} catch (IOException e) {
			e.printStackTrace();
			
		}
		finally {
			
			try {
				if (iFile != null) {
					iFile.close();
				}
				if(oFile != null) {
					oFile.close();
				}
			}
			catch (IOException e){
				e.printStackTrace();
				
			}
		}
		
		
		
	}

}
