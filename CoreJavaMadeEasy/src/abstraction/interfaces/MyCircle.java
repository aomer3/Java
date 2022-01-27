package j.abstraction.interfaces;

public class MyCircle implements Circle, CircleTwo {

	//1. If the method signatures are difference for the two interfaces, both implementations
	//must be provided. If the signatures are the same, just one implementation will suffice.
	
	//2. If the interface method signatures are the same but the return types are different,
	//then we cannot use both. We must pick one interface to implement.
	@Override
	public void calculateArea() {
		System.out.println(CircleTwo.pi); //Circle and CircleTwo both have pi, must specify
	}

}
