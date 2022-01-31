package n.multithreading.synchronization.classlock;

public class DisplayMessage {
	
	//Synchronized static methods (class locks) lock all other synchronized static methods,
	//when object is locked, but allow access for methods that are not static and synchronized
	public synchronized static void sayHello(String name) {
		
		for (int i = 0; i < 10; i++) {
			System.out.println("How are you " + name);
		}
	}

}
