package e.operators;

public class BitwiseOperators {
	
	public static void main(String[] args) {
		
		System.out.println("And Operator");
		System.out.println("True/True: " + (true & true) + "\n" +
				           "True/False: " + (true & false) +  "\n" +
				           "False/False: " + (false & false) + "\n");
		
		System.out.println("Or Operator");
		System.out.println("True/True: " + (true | true) + "\n" +
		           "True/False: " + (true | false) + "\n" +
		           "False/False: " + (false | false) + "\n");
		
		System.out.println("Xor Operator");
		System.out.println("True/True: " + (true ^ true) + "\n" +
		           "True/False: " + (true ^ false) + "\n" +
		           "False/False: " + (false ^ false) + "\n");
		
		
		System.out.println("Bitwise Operator on Numbers (binary addition)");
		System.out.println("4 & 5: " + (4&5));
		System.out.println("4 | 5: " + (4|5));
		System.out.println("4 ^ 5: " + (4^5));
	}

}
