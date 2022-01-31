package m.exceptionHandling.checked;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class UsingThrows {
	
	//Throws = used when a method will not handle an exception and the caller of the method
	//has to handle the exception
	void readFile() throws FileNotFoundException {
		
		FileInputStream fis = new FileInputStream("");
		
	}
	
	public static void main(String[] args) {
		
		UsingThrows ut = new UsingThrows();
		
		try {
		ut.readFile();
		} 
		catch(FileNotFoundException e) {
			System.out.println("File not found");
		}
		
	}

}
