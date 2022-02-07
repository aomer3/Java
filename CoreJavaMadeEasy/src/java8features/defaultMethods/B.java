package x.advancedTopics.java8features.defaultMethods;

//B cannot implement from both interfaces A and X when both A and X have default methods 
//of the same signature. Because B would not know which interface implementation to follow
//public class B implements A, X {

//}

//If B has its own overriden implementation, then this would solve the diamond problem
public class B implements A, X {
	
	public void m1() {
		System.out.println("inside m1 of B");
	}

}
