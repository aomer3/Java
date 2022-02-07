package x.advancedTopics.java8features.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ProcessingMethods {
	
	public static void main(String[] args) {
		
		List<Integer> l1 = new ArrayList();
		for(int i=0; i<=10; i++) {
			l1.add(i);
		}		
		System.out.println("Numbers: " + l1);
		
		//Using lambda expression to create a comparator (this will reverse-sort the list)
		Comparator<Integer> comp = (a,b)-> a.compareTo(b);
		Comparator<Integer> compReverse = (a,b)-> b.compareTo(a);
		
		//Processing the stream
		//Collect items into a collection 
		List<Integer> oddNumbers = l1.stream().filter(i->(i%2==0)).collect(Collectors.toList());
		System.out.println("Even numbers: " + oddNumbers);
		
		//Sort the items and return a new sorted collection. We're passing the comparator we made 
		List<Integer> l2 = l1.stream().filter(i->(i%2==0)).sorted(compReverse).collect(Collectors.toList());
		System.out.println("Reverse sorted: " + l2);
		
		//Count the number of items meeting filter criteria 
		long count = l1.stream().filter(i->(i%2==0)).count();
		System.out.println("Number of even numbers: " + count);
		
		//Find min and max values (both will need to be sorted and will need comparator to use)
		l2 = l1.stream().filter(i->(i%2==0)).sorted().collect(Collectors.toList());
		Integer min = l2.stream().min(comp).get();
		Integer max = l2.stream().max(comp).get();
		System.out.println("Min: " + min);
		System.out.println("Max: " + max);
		
		//Using foreach in a stream
		System.out.print("For each: ");
		l2.forEach(i->System.out.print(i + " "));
		
	}
	

}
