package v.collections.concurrent;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class ArrayListSolution {
	
	public static void main(String[] args) {
		
		CopyOnWriteArrayList<String> courses = new CopyOnWriteArrayList(); //change list to this
		courses.add("Java");
		courses.add("Python");
		courses.add("AWS");
		courses.add("Docker");
		
		Iterator<String> iterator = courses.iterator();
		
		while(iterator.hasNext()) {
			String course = iterator.next();
			System.out.println(course);
			if(course.equals("Docker")){
				courses.remove(course); //now we can use collection to modify list without throwing an exception
			}
		}
		
		System.out.println(courses);
	}

}
