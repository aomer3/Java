package v.collections;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

//TreeSets have additional methods (not found in other HashSets) from inheriting from NavigableSet
public class TreeSets {
	
	public static void main(String[] args) {
		
		List<Integer> birthyearsList = Arrays.asList(1980,2004,1997,1989,1995,1980,1992);
		TreeSet<Integer> birthyears = new TreeSet(birthyearsList);
		System.out.println("Original set: " + birthyears);
		
		int year = 1995;
		System.out.println("Comparing to year " + year + ":");
		//1.floor() = returns highest element in the set, which is lower than or equal to the number passed in	
		System.out.println("floor():" + birthyears.floor(year));
		//2.lower() = returns highest element in the set, which is lower than the number passed in	
		System.out.println("lower():" + birthyears.lower(year));
		//3.ceiling() = returns lowest element in the set, which is higher than or equal to the number passed in	
		System.out.println("ceiling():" + birthyears.ceiling(year));
		//4.higher() = returns lowest element in the set, which is higher than the number passed in	
		System.out.println("higher():" + birthyears.higher(year));
		//5.pollFirst() = returns and removes the first element in the set
		System.out.println("pollFirst():" + birthyears.pollFirst());
		//6.pollLast() = returns and removes the last element in the set
		System.out.println("pollLast():" + birthyears.pollLast());
		//7.descendingSet() = returns the set in reverse order
		System.out.println("Descending order:" + birthyears.descendingSet());
		
		
		
		
	}

}
