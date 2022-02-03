package v.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Iterators {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList();
		list.add(20);
		list.add(10);
		list.add(30);
		list.add(40);
		list.add(50);
		
		//Removing with iterators 
		
		list.remove(Integer.valueOf(30));
		
		//When using an iterator, the iterator will not allow you to use other collection's
		//remove methods, or it throws a concurrent modification exception
		Iterator<Integer> iterator = list.iterator();
		
		while(iterator.hasNext()) {
			Integer next = iterator.next();		
			System.out.print(next + " ");
			
			if(next == 40) {
				iterator.remove();
			}
			
		}
		
		//list.remove(Integer.valueOf(50)); //will cause concurrent modification exception
		
		//You can use a collection's remove method before the iterator's creation, but if
		//if you use a collection's remove method after an iterator has been created, you 
		//can no longer use the iterator 
//		while(iterator.hasNext()) {
//			Integer next = iterator.next();		
//			System.out.print(next + " ");
//			
//			if(next == 40) {
//				iterator.remove();
//			}
//			
//		}
				
		System.out.println("\nList:" + list + "\n");
		
		
		///// USING LIST ITERATORS (FOR ABILITY TO GO BACKWARDS IN A LIST) ////
		
		//Traversing elements with list iterators
		List<String> letters = new LinkedList();
		letters.add("abc");
		letters.add("def");
		letters.add("xyz");
		
		ListIterator<String> li = letters.listIterator();
		System.out.println("List: " + letters);
		
		System.out.print("Forward direction: ");
		while (li.hasNext()) {
			System.out.print(li.next() + " ");
			
		}
		
		System.out.print("\nBackward direction: ");
		while (li.hasPrevious()) {
			System.out.print(li.previous() + " ");
			
		}
		
	
	
	}
}
