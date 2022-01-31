package n.multithreading.daemon;

public class TestDaemon {
	
	public static void main(String[] args) {
		
		//Daemon thread = a thread that runs in the background
		System.out.println(Thread.currentThread().isDaemon());
		
		//Main thread will not wait for a daemon thread. Main thread will finish before 
		//daemon thread is finished doing its work
		MyThread myThread = new MyThread();
		myThread.setDaemon(true);
		System.out.println(myThread.isDaemon());
		myThread.start();
	}

}
