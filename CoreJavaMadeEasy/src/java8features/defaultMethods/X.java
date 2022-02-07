package x.advancedTopics.java8features.defaultMethods;

public interface X {

	default void m1() {
		System.out.println("inside m1 of X");
	}
}
