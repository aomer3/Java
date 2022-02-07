package x.advancedTopics.java8features.lambdas.anonymous;

public class Test {
	
	public static void main(String[] args) {
		
		//Using anonymous inner classes to create and run a thread 
		Thread t = new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i=1; i<=10; i++) {
					System.out.println("Anonymous child thread");
				}
			}
		});
		//t.start();
		
		//Using lambdas to implement anonymous classes
		Thread t2 = new Thread( ()-> {
			
			for(int i=1; i<=10; i++) {
				System.out.println("Lambdas implementing anonymous class");
			}
		});
		t2.start();				
		
		for(int i=1; i<=10; i++) {
			System.out.println("Main thread");
		}
		
	}

}
