package y.notes.regularExpressions;

import java.util.regex.Pattern;

public class CharactersAndQuantifiers {
	
	public static void main(String[] args) {
		
		//[abc] = match if there is total single occurrence of a,b, or c 
		//a = true, b = true, c = true, ab = false, abc = false, d = false
		System.out.println(Pattern.matches("[abc]", "bc"));
		
		//[abc]+ = matches if there is one or more occurrence of a, b or c
		//any number of and only a,b,c characters will return true
		System.out.println(Pattern.matches("[abc]+", "abcba"));
		
		//[abc]* = matches if there are zero or more occurances of a, b or c
		System.out.println(Pattern.matches("[abc]+", "a"));
		
		// \\d= true if digit
		System.out.println(Pattern.matches("\\d", "5"));
		
		// \\D = true if not digit
		System.out.println(Pattern.matches("\\D", "a"));
		
		//{} = true if exact number of occurrences of this pattern
		System.out.println(Pattern.matches("[a-zA-Z0-9]{5}", "abcde"));
		
		// {x,y} = min and max acceptable length of characters 
		System.out.println(Pattern.matches("[a-zA-Z0-9]{2,5}", "cat"));
		
	}

}
