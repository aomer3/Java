package s.iostreams;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//This program will copy an existing image and save it to the same directory
public class FileOutputStreams {
	
	public static void main(String[] args) {
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream("C:/Users/953189/OneDrive - Cognizant/Documents/3 Java/CoreJaveMadeEasy/coffee.jpg");
			fos = new FileOutputStream("C:/Users/953189/OneDrive - Cognizant/Documents/3 Java/CoreJaveMadeEasy/coffee2.jpg");
			
			int data;
			while((data=fis.read()) != -1) {
				fos.write(data);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				System.out.println("File copied");
				fis.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
