package e.operators;

public class StringConcat {

	public static void main(String[] args) {

		//Only overloaded operator is the plus operator (addition or concatenation)
		String s1 = "xyz";
		String s2 = "abc";

		int a = 10, b = 20, c = 30;

		System.out.println(s1 + s2);
		System.out.println(a+b+c);
		
		// If it starts with string the entire result becomes a string 
		System.out.println(s1 + a + b + c);
		
		// If you start with an integer in the printout, it will do addition 
		System.out.println(a + b + c + s1);
		
		// If you start with string and use parenthesis, it will do proper addition
		System.out.println(s1 + (a + b + c));

	}

}
