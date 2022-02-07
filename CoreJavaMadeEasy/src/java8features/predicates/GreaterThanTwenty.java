package x.advancedTopics.java8features.predicates;

import java.util.function.Predicate;

public class GreaterThanTwenty {
	
	public static void main(String[] args) {
		
		//booleans are not functions, so i has to be hard-coded
		int k=6;
		boolean b = k > 20? true : false;
		System.out.println("Boolean: " + b);
		
		//predicates are functions that can take in any data type and will return booleans
		Predicate<Integer> p = i->(i>20);
		System.out.println("Predicate: " + p.test(25));
	
	}

}
