package s.iostreams;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class TryWithResources {
	
	public static void main(String[] args) {
		
		//If the streams are defined within the try resource block, then JVM will automatically
		//close the resources and you do not have to close them in the finally block
		try(FileReader fr = new FileReader("C:/Users/953189/OneDrive - Cognizant/Documents/3 Java/CoreJaveMadeEasy/myfile.txt");
			BufferedReader br = new BufferedReader(fr);) {
			
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
		}
		
	}

}
