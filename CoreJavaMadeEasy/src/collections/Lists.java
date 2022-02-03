package v.collections;

import java.util.ArrayList;
import java.util.List;

public class Lists {

	public static void main(String[] args) {
		
		//Good practice to use parent interfaces (i.e. List) to create lists, allows for easy switch from ArrayList to LinkedList if needed
		//Good practice to use generics to avoid mixing data types, resulting in runtime exceptions
		List<Integer> list = new ArrayList();
		
		for(int i =10; i < 100; i+=10) {
			list.add(i);
		}
		
		System.out.println("List: " + list);
		
		//Inserting to list
		list.add(2, 100);//Autoboxing will turn all added primitives into objects

		System.out.println("List after insert: " + list);
		
		//Replacing in a list
		list.set(3,200);
		System.out.println("List after replacement: " + list);
		
		//Adding a list to a list
		List<Integer> secondList = new ArrayList();
		secondList.add(111);
		secondList.add(222);
		secondList.add(333);
		System.out.println("Second list: " + secondList);
		list.addAll(4, secondList);
		System.out.println("List after adding second list: " + list);
		
		//Searching through a list
		int value = 123;
		if(list.contains(value)) {
			System.out.println("List contains " + value);
		}
		else {
			System.out.println("List does not contain " + value);
		}
		
		//Retrieving elements from a list
		System.out.println("Retrieving elements from a list:");
		for(int i=0; i < list.size(); i++) {
			System.out.println("Element: " + list.get(i));
		}
		
		//Deleting elements from a list
		list.remove(3); //remove by integer
		list.remove(Integer.valueOf(10)); //remove by value
		System.out.println("List after deletion: " + list);


		
	}
}
