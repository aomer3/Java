package n.multithreading.deadlock;

public class SecondResource {
	
	public synchronized void method1(FirstResource fr) {
		System.out.println("Inside Second Resource method 1");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Invoking First Resource method2");
		fr.method2();
	}
	
	public synchronized void method2() {
		System.out.println("Inside Second Resource method 2");
	}

}
