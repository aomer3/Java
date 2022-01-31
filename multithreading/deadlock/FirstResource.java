package n.multithreading.deadlock;

public class FirstResource {
	
	public synchronized void method1(SecondResource sr) {
		System.out.println("Inside First Resource method 1");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Invoking Second Resource method2");
		sr.method2();
	}
	
	public synchronized void method2() {
		System.out.println("Inside First Resource method 2");
	}

}
