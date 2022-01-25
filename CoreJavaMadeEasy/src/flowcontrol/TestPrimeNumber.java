package f.flowcontrol;

import java.util.Scanner;

public class TestPrimeNumber {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = scan.nextInt();
		
		boolean primeFlag = true;
		
		for(int i=2; i < num; i++) {
			if(i == num) {
				continue;
			}
			if(num % i == 0) {
				primeFlag = false;
			}
		}
		
		if(primeFlag) {
			System.out.println("Prime No");
		} else {
			System.out.println("Not a Prime No");
		}
	}

}
