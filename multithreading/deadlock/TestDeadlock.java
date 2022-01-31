package n.multithreading.deadlock;

public class TestDeadlock implements Runnable {
	
	FirstResource fr = new FirstResource();
	SecondResource  sr = new SecondResource();
	
	public TestDeadlock() {
		new Thread(this).start();
		sr.method1(fr);
	}
	
	@Override
	public void run() {
		fr.method1(sr);
	}

	
	public static void main(String[] args) {
		
		new TestDeadlock();
		
	}
	
}
