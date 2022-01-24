package e.operators;

public class UnaryOperators {
	
	public static void main(String[] args) {
		
		//Pre-Increment operator (increment first then save)
		int a = 10;
		int b = ++a;
		
		System.out.println("A:" + a + " " + "B:" + b);
		
		//Post-Increment operator (save first then increment)
		int c = 10;
		int d = c++;
		
		System.out.println("C:" + c + " " + "D:" + d);
	}

}
