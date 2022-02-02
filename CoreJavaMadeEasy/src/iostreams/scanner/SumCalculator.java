package s.iostreams.scanner;

import java.util.Scanner;

public class SumCalculator {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter numbers to be added: ");
		int sum = 0;
		
		while(scanner.hasNextInt()) {
			int num = scanner.nextInt();
			sum += num;
		}
		
		System.out.println("Sum: " + sum);
	}

}
