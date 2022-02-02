package s.iostreams;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

//This program will read a file and count all of the words in it
public class BufferedReaders {
	
	public static void main(String[] args) {
		
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader("C:/Users/953189/OneDrive - Cognizant/Documents/3 Java/CoreJaveMadeEasy/myfile.txt");
			br = new BufferedReader(fr);
			
			int count = 0;
			
			String line;
			
			while((line=br.readLine()) != null) {
				StringTokenizer st = new StringTokenizer(line);
				
				while(st.hasMoreTokens()) {
					System.out.println(st.nextToken());
					count++;
				}
			}
			
			System.out.println("Number of words in the file: " + count);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fr.close();
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
