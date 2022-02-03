package v.collections.staticMethods;

import java.util.Arrays;

public class SortedArray {
	
	public static void main(String[] args) {
		
		int[] a = {40,10,15,7};
		
		System.out.print("Before sort: ");
		for (int element : a) {
			System.out.print(element + " ");
		}
		
		//sort() = sorts elements in an array
		Arrays.sort(a);
		
		System.out.print("\nAfter sort: ");
		for (int element : a) {
			System.out.print(element + " ");
		}
		
		//custom comparator with arrays
		String[] s = {"Y","A","Z","P"};
		System.out.print("\nBefore custom sort: ");
		for (String element : s) {
			System.out.print(element + " ");
		}
		
		Arrays.sort(s, new StringComparator());
		System.out.print("\nComparator sort: ");
		for (String element : s) {
			System.out.print(element + " ");
		}
		System.out.println("");
		
		//binarySearch() searches for an element in an array
		Arrays.sort(s, new StringComparator()); //must be sorted before binary searching
		String search = "Z";
		int result = Arrays.binarySearch(s, search);
		
		if(result > -1) {
			System.out.println("Search: " + search + " found at " + result);
		} else {
			System.out.println("Search: " + search + " not found");
		}
		
	}

}
