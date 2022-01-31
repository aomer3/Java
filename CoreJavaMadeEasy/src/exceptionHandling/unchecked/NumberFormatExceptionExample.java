package m.exceptionHandling.unchecked;

public class NumberFormatExceptionExample {
	
	public static void main(String[] args) {
		
		String s = "abcd";
		int i = Integer.parseInt(s);  //NumberFormatException = error storing value type
	}

}
