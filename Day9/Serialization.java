package training.com.omar.Day9;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialization {

	public static void main(String[] args) {
		
		Student s = new Student();
		
		s.Name = "Omar Huq";
		s.ID = 1234;
		s.GPA = 4.0;
		
		
		  try {
		         FileOutputStream oFile = new FileOutputStream("C:\\Users\\Omar\\eclipse-workspace\\HW1_HCL\\src\\main\\java\\training\\com\\omar\\Day9\\Student.ser");
		         ObjectOutputStream out = new ObjectOutputStream(oFile);
		         out.writeObject(s);
		         out.close();
		         oFile.close();
		         System.out.printf("Serialized Object created...");
		      } catch (IOException i) {
		         i.printStackTrace();
		      }
		
		
	}

}
