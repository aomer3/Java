package n.multithreading.synchronization;

public class DisplayMessage {
	
	//Synchronized keyword allows only one thread to use this object and locks all others out
	public synchronized void sayHello(String name) {
		
		for (int i = 0; i < 10; i++) {
			System.out.println("How are you " + name);
		}
	}

}
