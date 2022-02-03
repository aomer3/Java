package v.collections.concurrent;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

//CopyOnWrite in a multithreaded context will run two threads who will both access the same 
//list (one thread removing an element, second thread adding an element) without issue
public class SetMultipleThreads extends Thread {
	
	static CopyOnWriteArraySet<String> courses = new CopyOnWriteArraySet();
	
	@Override
	public void run() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		courses.add("Kuberenetes");
	}
	
	public static void main(String[] args) {
		
		SetMultipleThreads mt = new SetMultipleThreads();
		mt.start();
		 
		courses.add("Java");
		courses.add("Python");
		courses.add("AWS");
		courses.add("AWS");
		courses.add("Docker");
		
		Iterator<String> iterator = courses.iterator();
		
		while(iterator.hasNext()) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			String course = iterator.next();
			System.out.print(course + " ");
			if(course.equals("Docker")) {
				courses.remove("Docker");
			}
		}
		
		System.out.println("\n" + courses);
	}

}
