package v.collections.staticMethods;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import v.collections.comparators.StringComparator;

public class SortedList {
	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList();
		list.add("Z");
		list.add("A");
		list.add("X");
		list.add("B");	
		System.out.println("Original list: " + list);
		
		//sort() = sorts a collection in ascending order
		Collections.sort(list);
		System.out.println("After sort(): " + list);
		
		//using comparator for custom sorting
		Collections.sort(list, new StringComparator());
		System.out.println("Comparator sort: " + list);
		
		//reverse() = sorts a collection in descending order
		Collections.reverse(list);
		System.out.println("After reverse(): " + list);
		
		//binarySearch() to search for an element in a collection
		String search = "X";
		int result = Collections.binarySearch(list, search);
		
		if(result > -1) {
			System.out.println(search + " found at: " + result);
		}else {
			System.out.println(search + " not found");
		}
				
		
 	}

}
