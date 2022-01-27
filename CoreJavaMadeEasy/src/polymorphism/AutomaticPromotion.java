package k.polymorphism;

//Compiler will automitcally data type to next level up if method of input data type not found
//ex: will promote int input to float if method with no int input exists
public class AutomaticPromotion {
	
	public void print(char c) {
		System.out.println("Character Version:" + c);
	}
	
	public void print(float f) {
		System.out.println("Float Version:" + f);
	}
	
	public void print(Object o) {
		System.out.println("Object version");
	}
	
	public static void main(String[] args) {
		
		AutomaticPromotion ap = new AutomaticPromotion();
		ap.print(123);
		ap.print(10.5f);
		ap.print("Hello");
	}

}
