package s.iostreams;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//This program will read a text file 
public class FileInputStreams {
	
	public static void main(String[] args) {
		
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream(new File("C:/Users/953189/OneDrive - Cognizant/Documents/3 Java/CoreJaveMadeEasy/myfile.txt"));
			System.out.println("File Opened");
			
			int i;
			while((i=fis.read()) != -1) { //-1 is the flag that checks if end of file has been reached
				System.out.print((char) i); //removing char typecast will give you binary representation of the file
			}
						
		} catch (FileNotFoundException e) {
			System.out.println("File was not found.");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println("\nFile Closed");
		}
	}

}
