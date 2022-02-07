package y.notes.regularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator {
	
	public static void main(String[] args) {
		
		//^[] = starts with. In this case, first part of email could have letters, numbers, a dot, underscore and a hyphen
		//[]+ = it can have one or more of these allowed characters
		//$ = this is where the pattern should end
		Pattern pattern = Pattern.compile("^[a-zA-Z0-9_.-]+@[a-zA-Z0-9_.-]+$"); 
		Matcher matcher = pattern.matcher("jack@gmail.com");
		
		if(matcher.matches()) {
			System.out.println("valid email id");
		} else {
			System.out.println("invalid email id");
		}
		
		
		
		
	}

}
