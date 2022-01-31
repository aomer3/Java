package m.exceptionHandling.unchecked;

import java.util.Scanner;

public class FinallyBlock {
	
	public static void main(String[] args) {
		
		int a,b,c;
		
		try {
		System.out.println("Enter two integers");
		
		Scanner scan = new Scanner(System.in);
		
		a = scan.nextInt();
		b = scan.nextInt();
		c = a/b; 
		
		System.out.println("Result: " + c);
		} catch(ArithmeticException e){
			System.out.println("Division by zero not allowed.");
		} finally{
			System.out.println("1. Finally can be used with or without a catch block.");
			System.out.println("2. Finally block is executed always, whether or not there is an exception thrown.");
			System.out.println("3. You should close all your resources here in the finally block.");
		}		
		
	}

}
