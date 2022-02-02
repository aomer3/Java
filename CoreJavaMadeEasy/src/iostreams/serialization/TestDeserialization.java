package s.iostreams.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

//This
public class TestDeserialization {
	
	public static void main(String[] args) {
		
		FileInputStream fis;
		ObjectInputStream ois;
		
		try {
			fis = new FileInputStream("C:/Users/953189/OneDrive - Cognizant/Documents/3 Java/CoreJaveMadeEasy/emp.ser");
			ois = new ObjectInputStream(fis);
			
			Employee emp = (Employee) ois.readObject();
			
			System.out.println("Id: " + emp.id);
			System.out.println("Name: " + emp.name);
			System.out.println("Salary " + emp.salary);
			System.out.println("SSN: " + emp.ssn); //SSN is zero (default int value) b/c it was never serialized since it was marked transient
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
