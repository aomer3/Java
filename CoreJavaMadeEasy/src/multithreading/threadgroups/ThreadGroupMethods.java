package n.multithreading.threadgroups;

public class ThreadGroupMethods {
	
	public static void main(String[] args) throws InterruptedException {
		
		ThreadGroup mtg = new ThreadGroup("MyThreadGroup");
		
		CustomThread thread1 = new CustomThread(mtg, "Thread 1");
		CustomThread thread2 = new CustomThread(mtg, "Thread 2");
		CustomThread thread3 = new CustomThread(mtg, "Thread 3");
		
		thread1.start();
		thread2.start();
		thread3.start();
		
		//activeCount() will give back how many threads are in a group and are currently running
		System.out.println(mtg.activeCount());
		
		//This will give you info about the threads in the group
		mtg.list();
		
		//Since threads are sleeping, active count will be zero
		Thread.sleep(5000);
		System.out.println(mtg.activeCount());		
		mtg.list();
	}

}
