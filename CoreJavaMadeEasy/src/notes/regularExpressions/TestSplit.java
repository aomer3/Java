package y.notes.regularExpressions;

import java.util.regex.Pattern;

public class TestSplit {
	
	public static void main(String[] args) {
		
		//Split method with pattern matcher
		Pattern pattern = Pattern.compile("\\s");
		String[] words = pattern.split("how are you");
		
		for (String word: words) {
			System.out.println(word);
		}
		
		//Split method with string split
		String website = "www.google.com";
		String[] url = website.split("[.]");
		
		for (String domain: url) {
			System.out.println(domain);
		}
	}

}
