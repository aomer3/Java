package k.polymorphism;

public class MacBookAir extends MacBook {

	@Override
	public void start() {
		System.out.println("MacBook Air start");
	}
	
	@Override
	public void shutdown() {
		System.out.println("MacBook Air shutdown");
	}
}
