package s.iostreams;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

//This program will copy a text file and save it to the same directory
public class ReaderWriter {
	
	public static void main(String[] args) throws Exception { //better to use try catch but throws will still work
		
		FileReader fr = null;
		FileWriter fw = null;
		
		fr = new FileReader("C:/Users/953189/OneDrive - Cognizant/Documents/3 Java/CoreJaveMadeEasy/myfile.txt");
		fw = new FileWriter("C:/Users/953189/OneDrive - Cognizant/Documents/3 Java/CoreJaveMadeEasy/newfile.txt");
		
		int ch;
		while((ch=fr.read()) != -1) {
			fw.write(ch);
		}
		
		fr.close();
		fw.close();
		
		System.out.println("File has been copied");
	}

}
