package r.strings;

public class StringMethods {
	
	public static void main(String[] args) {
		
		String message = "Hello World";
		
		System.out.println("Length of string:" + message.length());
		System.out.println("Index of letter 'o':" + message.indexOf('o'));
		System.out.println("Character at index 1:" + message.charAt(1));
		System.out.println("Substring start at index 2: " + message.substring(2));
		System.out.println("Substring start at index 2, end at 6: " + message.substring(2,6));
		
		System.out.println("Split method: ");
		String[] result = message.split(" ");
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
		
		System.out.println("Replace 'l' with 'k':" + message.replace("l", "k"));
		System.out.println("Make uppercase: " + message.toUpperCase());
		System.out.println("Make lowercase: " + message.toLowerCase());
		
	}

}
