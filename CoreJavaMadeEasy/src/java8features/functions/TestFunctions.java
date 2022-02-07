package x.advancedTopics.java8features.functions;

import java.util.function.Function;

public class TestFunctions {
	
	public static void main(String[] args) {
		
		Function<String, Integer> f = s->(s.length());
		System.out.println("Happy:" + f.apply("Happy"));
		System.out.println("John:" + f.apply("John"));
	}

}
