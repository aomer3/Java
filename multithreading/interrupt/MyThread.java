package n.multithreading.interrupt;

public class MyThread extends Thread {
	
	public void run() {
		
		try {
			for (int i = 0; i <= 10; i++) {
				System.out.println("I am a lazy thread");
				Thread.sleep(2000);
			}
		}
		catch(InterruptedException e) {
			System.out.println("Got interrupted");
		}
	}

}
