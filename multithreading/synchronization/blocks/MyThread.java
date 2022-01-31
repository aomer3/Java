package n.multithreading.synchronization.blocks;

public class MyThread extends Thread {

	DisplayMessage dm;
	String name;
	
	MyThread(DisplayMessage dm, String name){
		this.dm = dm;
		this.name = name;
	}
	
	@Override
	public void run() {
		dm.sayHello(name);
	}
}
