package x.advancedTopics.java8features.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterEvenNumbers {
	
	public static void main(String[] args) {
		
		List<Integer> l1 = new ArrayList();
		for(int i=0; i<=10; i++) {
			l1.add(i);
		}		
		System.out.println(l1);
		
		//Traditional way of filtering through a list
		System.out.println("Even numbers (using for loop):");
		for (Integer number : l1) {
			if(number%2==0) {
				System.out.print(number + " ");
			}
		}
		
		//Using streams to filter through a list 
		System.out.println("\nOdd numbers (using stream):");
		l1.stream().filter(i->(i%2!=0)).forEach(i->System.out.print(i + " "));
		
		//Streams can also be saved into a new collection after filtering
		List<Integer> oddNumbers = l1.stream().filter(i->(i%2!=0)).collect(Collectors.toList());
		System.out.println("List: " + oddNumbers);
	}
	

}
