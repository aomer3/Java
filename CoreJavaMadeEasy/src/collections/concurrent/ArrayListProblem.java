package v.collections.concurrent;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListProblem {
	
	public static void main(String[] args) {
		
		ArrayList<String> courses = new ArrayList();
		courses.add("Java");
		courses.add("Python");
		courses.add("AWS");
		courses.add("Docker");
		
		Iterator<String> iterator = courses.iterator();
		
		//adding or removing with the collection, after the iterator has been created,
		//will throw a concurrent modification exception
		while(iterator.hasNext()) {
			String course = iterator.next();
			System.out.println(course);
			if(course.equals("Docker")){
				iterator.remove(); //iterator remove works fine
				courses.remove(course); //using collection to remove will throw an exception
			}
		}
		
		System.out.println(courses);
	}

}
