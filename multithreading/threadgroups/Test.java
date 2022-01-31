package n.multithreading.threadgroups;

public class Test {
	
	public static void main(String[] args) {
		//Thread group name for main thread
		//System.out.println(Thread.currentThread().getThreadGroup().getName());
		//Parent of main thread group
		//System.out.println(Thread.currentThread().getThreadGroup().getParent().getName());
		
		ThreadGroup parent = new ThreadGroup("Color");
		//System.out.println(parent.getName());
		
		//Creating a child thread group and assigning it to a parent thread group
		ThreadGroup child = new ThreadGroup(parent, "Red");
		System.out.println(child.getName());
		System.out.println(child.getParent().getName());
		child.setMaxPriority(4);
		
		Thread thread1 = new Thread(child, "Thread 1");
		Thread thread2  = new Thread(child, "Thread 2");
		
		System.out.println(thread1.getThreadGroup().getName());
		System.out.println(thread1.getPriority());
	}

}
