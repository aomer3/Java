package k.polymorphism;

public class MacBookPro extends MacBook {
	
	@Override
	public void start() {
		System.out.println("MacBook Pro start");
	}
	
	@Override
	public void shutdown() {
		System.out.println("MacBook Pro shutdown");
	}
	
	public void promethod() {
		System.out.println("MacBook Pro method");
	}

}
