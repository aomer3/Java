package m.exceptionHandling.checked;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptions {
	
	public static void main(String[] args) {
		
		try {
			FileInputStream fis = new FileInputStream("");
		} catch (FileNotFoundException e) {
			System.out.println("File could not be found");
		}
	}

}
