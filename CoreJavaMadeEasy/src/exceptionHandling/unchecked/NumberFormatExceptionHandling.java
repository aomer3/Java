package m.exceptionHandling.unchecked;

public class NumberFormatExceptionHandling {
	
	public static void main(String[] args) {
		
		String s = "abcd";
		
		try {
			int i = Integer.parseInt(s);  //NumberFormatException = error storing value type
		} catch(NumberFormatException e) {
			System.out.println("Cannot parse non-number String into an integer.");
		}
	}

}
