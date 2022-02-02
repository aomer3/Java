package s.iostreams.serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

//This program will take an Employee object and serialize it to a file
public class TestSerialization {
	
	public static void main(String[] args) {
		
		FileOutputStream fos;
		ObjectOutputStream oos;
		
		try {
			fos = new FileOutputStream("C:/Users/953189/OneDrive - Cognizant/Documents/3 Java/CoreJaveMadeEasy/emp.ser");
			oos = new ObjectOutputStream(fos);
			
			Employee emp = new Employee(1, "John", 100000, 12345);
			oos.writeObject(emp);
			System.out.println("Employee Object Serialized");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
