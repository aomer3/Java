package n.multithreading.yield;

public class MyThread extends Thread {
	
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Child Thread");
			//Yield method allows for other threads to finish before executing this thread
			Thread.yield();
		}
	}

}
