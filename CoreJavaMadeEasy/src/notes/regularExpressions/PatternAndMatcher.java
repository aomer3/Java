package y.notes.regularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternAndMatcher {
	
	public static void main(String[] args) {
		
		Pattern pattern = Pattern.compile("abc");
		Matcher matcher = pattern.matcher("abcdefghiabcdefgabcdefg");
		
		while(matcher.find()) {
			System.out.println(matcher.start()); //first index that pattern was found
			System.out.println(matcher.end()); //index after pattern was completed
			System.out.println(matcher.group()); //the group of String found that matched the pattern
		}
		
		
	}

}
