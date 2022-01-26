package h.packages.insidethepackage;

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Math.*;

public class SumOfTwoNumbers {
	
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		//Using static imports instead of fully qualified name
		out.println("Enter two integers");
		
		int num1 = parseInt(scan.next());
		int num2 = parseInt(scan.next());
		
		int result = num1 + num2;
		out.println("Sum is " + result);
		
		System.out.println(pow(2, 3));
		System.out.println(sqrt(36));
	}

}
