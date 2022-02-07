package x.advancedTopics.java8features.defaultMethods;

public interface A {
	
	//default keyword can only be used in interfaces
	default void m1() {
		System.out.println("inside m1 of A");
	}

}
