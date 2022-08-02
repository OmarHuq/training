package training.com.omar.Day9;

import java.io.*;

public class BufferedReadWrite {

	public static void main(String[] args) {

		
			
			try {
			
				File iFile = new File("C:\\Users\\Omar\\eclipse-workspace\\HW1_HCL\\src\\main\\java\\training\\com\\omar\\Day9\\BuffInput.txt");
				FileReader reader = new FileReader(iFile);
				BufferedReader br = new BufferedReader (reader);
				
				File oFile = new File("C:\\Users\\Omar\\eclipse-workspace\\HW1_HCL\\src\\main\\java\\training\\com\\omar\\Day9\\BuffOutput.txt");
				Writer output = new FileWriter(oFile);
				BufferedWriter bw = new BufferedWriter(output);
			
				String text = null;
			
				while ((text = br.readLine()) != null) {
						bw.write(text);
					} 
				br.close();
				bw.close();
				System.out.println("Writing with Buffered...");
			}catch (IOException e) {
				
				e.printStackTrace();
			}
			
			
			
				
		
				
			}
				
		
	}


