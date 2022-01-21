package b.datatypes;

public class ExplicitCast {
	
	public static void main(String[] args) {
		
		// Explicit casting = casting from higher data type to lower data type
		// Must be explicitly typecasted 
		int i = 100;
		byte b = (byte) i;
		
		int x = 97;
		char c = (char) x;
		
		System.out.println(c);
	}

}
