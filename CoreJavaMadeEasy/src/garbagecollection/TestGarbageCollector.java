package p.garbagecollection;

public class TestGarbageCollector {
	
	int id;
	
	public TestGarbageCollector(int id) {
		this.id = id;
		System.out.println("Created " + this.id);
	}
	
	//finalize() exists with every object, it's called when the object will be destroyed
	@Override
	protected void finalize() {
		System.out.println("Destroyed " + this.id);
	}
	
	public static void main(String[] args) {
		
		//Garbage collector doesn't always run, it runs when it think system 
		//is running out of memory
		for(int i=1; i <= 5; i++) {
			new TestGarbageCollector(i);
		}
		
		//Manually calling the garbage collector
		System.gc();
		
	}
}
