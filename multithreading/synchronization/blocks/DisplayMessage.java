package n.multithreading.synchronization.blocks;

public class DisplayMessage {
	
	public void sayHello(String name) {
		//Any code before synchronized block can still be executed even if locked
		System.out.println("What a sunny day outside " + Thread.currentThread().getName());
		
		//The for loop is in the synchronized block. This means no other thread can use 
		//the for loop until the first thread is done.
		synchronized(this) {
			for (int i = 0; i < 10; i++) {
				System.out.println("How are you " + name);
			}
		}
		
		//This will give you a class level synchronized block
//		synchronized(DisplayMessage.class) {
//			for (int i = 0; i < 10; i++) {
//				System.out.println("How are you " + name);
//			}
//		}
		
	}

}
