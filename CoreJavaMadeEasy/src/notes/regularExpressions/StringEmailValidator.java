package y.notes.regularExpressions;

public class StringEmailValidator {
	
	public static void main(String[] args) {
		
		String acceptableEmail = "^[a-zA-Z0-9_.-]+@[a-zA-Z0-9_.-]+$";
		String email = "jack@gmail.com";
		
		if(email.matches(acceptableEmail)) {
			System.out.println("valid email id");
		} else {
			System.out.println("invalid email id");
		}
		
		
		
		
	}

}
