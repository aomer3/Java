package v.collections.concurrent;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

//CopyOnWrite in a multithreaded context will run two threads who will both access the same 
//list (one thread removing an element, second thread adding an element) without issue
public class MapMultipleThreads extends Thread {
	
	static ConcurrentHashMap<String,String> courseRatings = new ConcurrentHashMap();
	
	@Override
	public void run() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		courseRatings.put("Kuberenetes", "4.8");
	}
	
	public static void main(String[] args) {
		
		MapMultipleThreads mt = new MapMultipleThreads();
		mt.start();
		 
		courseRatings.put("Java", "5.0");
		courseRatings.put("Python", "4.8");
		courseRatings.put("AWS", "4.7");
		courseRatings.put("Docker", "4.7");
		
		Iterator<String> iterator = courseRatings.keySet().iterator();
		
		while(iterator.hasNext()) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			String course = iterator.next();
			System.out.print(course + " ");
			System.out.print(courseRatings.get(course) + " ");
			if(course.equals("Docker")) {
				courseRatings.remove("Docker");
			}
		}
		
		System.out.println("\n" + courseRatings);
	}

}
