package x.advancedTopics.java8features.lambdas.basics;

public class Test {
	
	public static void main(String[] args) {
		
		//This is the traditional way of using interfaces (by creating a class that will 
		//implement that interface and then initializing the class
		A c = new C();
		c.myMethod();
		
		//Lambda expressions do the same thing much more efficiently 
		A a = ()->System.out.println("inside myMethod");
		a.myMethod();
	}

}
