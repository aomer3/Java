package m.exceptionHandling.unchecked;

import java.util.Scanner;

public class ArithmeticExceptionExample {
	
	public static void main(String[] args) {
		
		int a,b,c;
		
		System.out.println("Enter two integers");
		
		Scanner scan = new Scanner(System.in);
		
		a = scan.nextInt();
		b = scan.nextInt();
		c = a/b; //Arithmetic Exception = dividing by zero
		
		//if an exception happens, the JVM never reaches either of these lines
		System.out.println("Result: " + c);
		System.out.println("More code here after exception"); 
	}

}
