package v.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Sets {
	
	public static void main(String[] args) {
		
		Random obj = new Random();
		List<Integer> list = new ArrayList();	
		for(int i=1; i <=10; i++) {;
			int number = obj.nextInt(20);
			list.add(number);
			System.out.print(number + " ");
		}
		
		Set<Integer> set = new HashSet(list);
		Set<Integer> set2 = new LinkedHashSet(list);
		Set<Integer> set3 = new TreeSet(list);
		
		//HashSet does not maintain any order 
		System.out.println("\nHashSet: " + set);
		
		//LinkedHashSet maintains insertion order
	    System.out.println("LinkedHashSet: " + set2);
	    
	    //TreeSet maintains sorted order  
	  	System.out.println("TreeSet: " + set3);
		
	}

}
