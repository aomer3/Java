package n.multithreading;

import java.util.Scanner;

public class ThreadIdentity extends Thread {
		
	public static void main(String[] args) {
			
		ThreadIdentity ti = new ThreadIdentity();
		ti.setName("TI-1");
		ti.setPriority(1);
		ti.start();
		
		ThreadIdentity ti2 = new ThreadIdentity();
		ti2.setName("TI-2");
		ti2.setPriority(10);
		ti2.start();
		

	}

	public void run() {	
		//Get thread name and priority 
		Thread threadId = Thread.currentThread();
		System.out.println("Name: " + threadId.getName());
		System.out.println("Priority: " + threadId.getPriority());
	}
	
}
