package t.arrays;

public class ReverseArray {
	
	public static void main(String[] args) {
		
		
		String[] cars = {"BMW","Accura","Lexus","Mercedes","Porsche"};
		
		for(int i=cars.length-1; i >= 0; i--) {
			System.out.println(cars[i]);
		}
	}

}
