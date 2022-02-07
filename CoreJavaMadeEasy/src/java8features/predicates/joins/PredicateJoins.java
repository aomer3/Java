package x.advancedTopics.java8features.predicates.joins;

import java.util.function.Predicate;

public class PredicateJoins {
	
	public static void main(String[] args) {
		
		int[] x = {1,8,11,20,30,43,50,61,70,73};
		
		Predicate<Integer> p1 = i->(i>10);
		System.out.println("Greater than 10:");
		method1(p1,x);		
		
		Predicate<Integer> p2 = i->(i%2!=0);
		System.out.println("\nOdd:");
		method1(p2,x);
		
		Predicate<Integer> p3 = p1.and(p2);
		System.out.println("\nOdd and Greater than 10:");
		method1(p3,x);
		
		Predicate<Integer> p4 = p1.or(p2);
		System.out.println("\nOdd or Greater than 10:");
		method1(p4,x);
		
		Predicate<Integer> p5 = p1.negate().and(p2.negate());
		System.out.println("\nNot Odd and not Greater than 10:");
		method1(p5,x);
		
	}
	
	static void method1(Predicate<Integer> p, int[] x) {
		for(int value: x) {
			if(p.test(value)) {
				System.out.print(value + " ");
			}
		}
	}

}
