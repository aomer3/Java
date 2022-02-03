package v.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//Because LinkedList and ArrayList share the Collections interface, they have the same methods
public class LinkedListVsArrayList {

	public static void main(String[] args) {
		
		Object objects[] = new Object[1000000];
		
		for(int i=0; i< objects.length; i++) {
			objects[i] = new Object();
		}
		
		List<Object> list = new LinkedList();
		long llstart = System.currentTimeMillis();
		for (Object object : objects) {
			list.add(object);
		}
		long llend = System.currentTimeMillis();
		System.out.println("Time taken to add 1 million objects:");
		System.out.println("LinkedList: " + (llend - llstart) + " milliseconds");
		
		List<Object> list2 = new ArrayList();
		long alstart = System.currentTimeMillis();
		for (Object object : objects) {
			list2.add(object);
		}
		long alend = System.currentTimeMillis();
		System.out.println("ArrayList: " + (alend - alstart) + " milliseconds");

		
	}
}
