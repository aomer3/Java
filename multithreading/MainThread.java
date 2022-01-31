package n.multithreading;

public class MainThread {
	
	public static void main(String[] args) {
		
		EvenNumbersThread ent = new EvenNumbersThread();
		OddNumbersThread ont = new OddNumbersThread();
		
		new Thread(ent).start();
		new Thread(ont).start();
	}

}
