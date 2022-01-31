package n.multithreading;

public class Multithreaded extends Thread {
	
	public void run() {
		for (int i = 0; i < 200; i++) {
			System.out.print("red: " + i + " ");
		}
	}
	
	//Multi-threaded application = sequence is interwoven, the multiple threads do not
	//wait on each other to perform their work. Threads switch throughout the program
	public static void main(String[] args) {
		
		Multithreaded mt = new Multithreaded();
		mt.start();
		
		for (int j = 0; j < 200; j++) {
			System.out.print("blue: " + j + " ");
		}
		
	}
}
