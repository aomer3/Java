package r.strings;

public class StringCreation {
	
	public static void main(String[] args) {
		
		//Creating Strings
		//Method 1: Using string literal
		String s1 = "one";
		//Method 2: Using new keyword
		String s2 = new String("two");
		//Method 3: Using a char array (with chars, can use either literal or numbers)
		char c[] = {97,98,99};
		String s3 = new String(c);
		//Method 4: Using a byte array (with bytes, can use either literal or numbers)
		byte b[] = {65,66,67};
		String s4 = new String(b);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
	}

}
