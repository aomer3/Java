package y.notes.regularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberValidator {
	
	public static void main(String[] args) {
		
		Pattern pattern = Pattern.compile("^\\d{3}-\\d{3}-\\d{4}"); 
		Matcher matcher = pattern.matcher("123-456-7890");
		
		if(matcher.matches()) {
			System.out.println("valid phone number");
		} else {
			System.out.println("invalid phone number");
		}
		
		
		
		
	}

}
