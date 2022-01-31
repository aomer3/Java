package m.exceptionHandling.unchecked;

import java.util.Scanner;

public class ArithmeticExceptionHandling {
	
	public static void main(String[] args) {
		
		int a,b,c;
		
		try {
		System.out.println("Enter two integers");
		
		Scanner scan = new Scanner(System.in);
		
		a = scan.nextInt();
		b = scan.nextInt();
		c = a/b; //Arithmetic Exception = dividing by zero
		
		System.out.println("Result: " + c);
		} catch(ArithmeticException e){
			System.out.println("Division by zero not allowed.");
		}
		System.out.println("More code here after exception"); 
	}

}
