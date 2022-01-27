package k.polymorphism;

public class RunTimeBinding {

	public static void main(String[] args) {

		//Object casting
		AppleLaptop m1 = new MacBookPro(); //upcasting = child class casted to parent class
		
		System.out.println("M1");
		m1.start();
		m1.shutdown();
		
		//Downcasting = parent class casted to child class
		MacBookPro m2 = (MacBookPro) m1;
		
		System.out.println("M3");
		m2.start();
		m2.shutdown();
		m2.promethod();

	}

}
