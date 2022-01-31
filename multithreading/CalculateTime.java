package n.multithreading;

import java.util.Scanner;

public class CalculateTime extends Thread {
	
	static int n, sum = 0;
	
	public static void main(String[] args) {
		
		long start = System.currentTimeMillis();
		
		System.out.println("Sum of first 'N' numbers");
		System.out.println("Enter a value: ");
		
		Scanner scan = new Scanner(System.in);
		CalculateTime.n = scan.nextInt();
				
		CalculateTime j = new CalculateTime();
		j.start();
		
		try {
			j.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Sum of first " + CalculateTime.n + " numbers is " + CalculateTime.sum);
		
		long end = System.currentTimeMillis();
		
		System.out.println("Total time taken: " + (end - start)/1000 + " seconds");
	}

	public void run() {
		for (int i = 0; i <= CalculateTime.n; i++) {
			CalculateTime.sum += i;
		}
	}
	
}
