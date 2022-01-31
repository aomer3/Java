package n.multithreading.interrupt;

public class TestInterrupt {
	
	public static void main(String[] args) {
		
		MyThread t = new MyThread();
		t.start();
		
		//This will stop the created thread
		t.interrupt();
		
		System.out.println("End of main method");
		
	}

}
