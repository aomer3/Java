package x.advancedTopics.java8features.methodReferencing.constructors;

public class MyClass {
	
	private String s;
	
	MyClass(String s){
		this.s = s;
		System.out.println("Inside the MyClass constructor: "+ s);
	}

}
