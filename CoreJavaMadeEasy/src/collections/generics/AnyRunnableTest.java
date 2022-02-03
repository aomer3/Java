package v.collections.generics;

public class AnyRunnableTest {
	
	public static void main(String[] args) {
		
		//MyClass works because it implements both the Thread and Comparable interfaces
		AnyRunnable<MyClass> mc = new AnyRunnable<>();
		
		//This won't work because String doesn't implement the mentioned generics classes
		//AnyRunnable<String> s = new AnyRunnable<>();
	}

}
