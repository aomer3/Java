package n.multithreading.synchronization.threadcommunication;

public class MyThread extends Thread {
	
	int sum;

	@Override
	public void run() {
		
		System.out.println("Child thread is calculating the sum: ");
		
		//notify() will have the thread release the lock when the work is done 
		synchronized (this) {
			for (int i = 0; i <= 100; i++) {
				sum += i;
			}
			
			this.notify();
		}
		
	}
}
