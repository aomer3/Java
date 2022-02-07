package x.advancedTopics.java8features.lambdas.interfaces;

public class Test {
	
	public static void main(String[] args) {
		
		//Traditional way of implementing a thread by creating a class implementing Runnable
		//or Thread, initializing the class, then starting the thread
		//Runnable mr = new MyRunnable();
		//Thread t = new Thread(mr);
		//t.start();
		
		//Using lambdas to implement interfaces 
		Runnable r = ()->{
			for(int i=1; i<=10;i++) {
				System.out.println("Lambda expression");
			}
		}; 
		Thread t = new Thread(r);
		t.start();
		
		for(int i=1; i<=10; i++) {
			System.out.println("Main thread");
		}
		
	}

}
