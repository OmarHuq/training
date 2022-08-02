package training.com.omar.Day9;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadWriteBinary {

	public static void main(String[] args) {
		
		FileInputStream iFile = null;
		FileOutputStream oFile = null;
		
		
		int temp = 0;
		
		try {
			iFile = new FileInputStream("C:\\Users\\Omar\\eclipse-workspace\\HW1_HCL\\src\\main\\java\\training\\com\\omar\\Day9\\input.png");
			oFile = new FileOutputStream("C:\\Users\\Omar\\eclipse-workspace\\HW1_HCL\\src\\main\\java\\training\\com\\omar\\Day9\\output.png");
			
			try {
				while((temp = iFile.read()) != 1) {
					
					try {
						oFile.write((byte) temp);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.out.println("Writing...");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			try {
				if(iFile != null)
					iFile.close();
				if(oFile != null)
					oFile.close();
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
			
		}
		
		

	}

}
