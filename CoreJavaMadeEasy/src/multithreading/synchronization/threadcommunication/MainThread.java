package n.multithreading.synchronization.threadcommunication;

public class MainThread {
	
	public static void main(String[] args) {
		
		MyThread t = new MyThread();
		t.start();
		
		//wait() will release main thread lock on thread so that child thread can do work
		synchronized(t) {
			System.out.println("Main thread waiting..");
			try {
				t.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Sum: " + t.sum);
		}
	}

}
