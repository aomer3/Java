package y.notes.regularExpressions;

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Find list of text names in a directory and print file names and count
public class TextFileFinder {
	
	public static void main(String[] args) {
		
		File directory = new File("C://Users//953189//OneDrive - Cognizant//Documents//1 Behavioral Training");
		String[] fileNames = directory.list();
		
		Pattern pattern = Pattern.compile("[a-zA-Z0-9_]+[.]txt");
		int count = 0;
		for (String fileName : fileNames) {
			Matcher matcher = pattern.matcher(fileName);
			if(matcher.matches()) {
				count++;
				System.out.println(fileName);
			}
		}
		
		System.out.println("Number of text files: " + count);
	}

}
