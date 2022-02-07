package x.advancedTopics.java8features.predicates;

import java.util.function.Predicate;

public class LengthOfString {
	
	public static void main(String[] args) {
		
		Predicate<String> p = s->(s.length()>5);
		System.out.println("Greater than 5: ");
		System.out.println("Happy: " + p.test("Happy"));
		System.out.println("Dinosaur: " + p.test("Dinosaur"));
		
	}

}
