package x.advancedTopics.java8features.lambdas.basics;

//B must use and only use the exact same functional method in A, since it's extending a
//functional interface. If it adds more methods, B will no longer be a functional interface
public interface B extends A {
	
	void myMethod();
}
