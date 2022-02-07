package x.advancedTopics.java8features.methodReferencing;

public class TestMethodReferencing {
	
	public static void myMethod() {
		for(int i=0; i<=10;i++) {
			System.out.println("myMethod Thread");
		}
	}
	
	public static void main(String[] args) {
		
		//Alternative to using lambda expression, :: allows you to map you own method (myMethod)
		//to a functional interface method (Runnable run())
		Runnable r = TestMethodReferencing::myMethod; //method mapping with static method
		Thread t = new Thread(r);
		t.start();
	}

}
