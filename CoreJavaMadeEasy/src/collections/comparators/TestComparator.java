package v.collections.comparators;

import java.util.Arrays;
import java.util.List;

public class TestComparator {
	
	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("John","Sally","Jack","Tim","John");
		
		StringComparator sc = new StringComparator();
		
		String compare1 = names.get(0);
		String compare2 = names.get(2);
		int result = sc.compare(compare1,compare2);
		int result2 = sc.compareLengths(compare1,compare2);
		
		//Comparator comparing String values
		if(result == 1) {
			System.out.println(compare1 + " and " + compare2 + " are the same name.");
		} else {
			System.out.println(compare1 + " and " + compare2 + " are not the same name.");
		}
		
		//Comparator comparing String lengths
		if(result2 == 1) {
			System.out.println(compare1 + " and " + compare2 + " are the same length.");
		} else {
			System.out.println(compare1 + " and " + compare2 + " are not the same length.");
		}
	}

}
