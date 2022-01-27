package j.abstraction;

//Cannot create instance of an abstract class
public abstract class BMW {
	
	//concrete method, all cars will share the same implementation 
	void commonFunc() {
		System.out.println("Inside common functionality method");
	}
	
	//abstract method - leaves the implementation on how to accelerate to each car
	abstract void accelerate();
	
	public static void main(String[] args) {
		
		System.out.println("Inside the main method");
	}

}
