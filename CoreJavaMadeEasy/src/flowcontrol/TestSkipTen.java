package f.flowcontrol;

import java.util.Scanner;

public class TestSkipTen {
	
	public static void main(String[] args) {
		
		//Ask user to enter number, display all numbers up to the number that user entered,
		//skip all multiples of 10. Do this using while, do-while and for loop.
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = scan.nextInt();
		
		System.out.println("For loop implementation");
		for(int i=0; i < num; i++) {
			if(i%10==0) {
				continue;
			}
			System.out.println(i);
		}
		
		System.out.println("While loop implementation");
		int i=0;
		
		while(i < num) {
			if(i%10==0) {
				i++;
				continue;
			}
			System.out.println(i);
			i++;
		}
		
		System.out.println("Do-while loop implementation");
		i = 0;
		do {
			if(i%10==0) {
				i++;
				continue;
			}
			System.out.println(i);
			i++;
		}while(i < num);
	}

}
