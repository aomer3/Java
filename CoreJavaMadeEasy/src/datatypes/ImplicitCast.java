package b.datatypes;

public class ImplicitCast {
	
	public static void main(String[] args) {
		
		// Implicit type casting = casting from lower data type to higher type
		// this is done automatically
		byte b = 100;
		int i = b;
		
		char c = 'A';
		int x = c;
		
		System.out.println(i);
		System.out.println(x);
	}

}
