package n.multithreading;

import java.util.Scanner;

public class JoinMethod extends Thread {
	
	static int n, sum = 0;
	
	public static void main(String[] args) {
		
		System.out.println("Sum of first 'N' numbers");
		System.out.println("Enter a value: ");
		
		Scanner scan = new Scanner(System.in);
		JoinMethod.n = scan.nextInt();
		
		JoinMethod j = new JoinMethod();
		j.start();
		
		//Join method ensures that other threads are done before resuming back to main thread
		try {
			j.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Sum of first " + JoinMethod.n + " numbers is " + JoinMethod.sum);
		
	}

	public void run() {
		for (int i = 0; i <= JoinMethod.n; i++) {
			JoinMethod.sum += i;
		}
	}
	
}
