package e.operators;

public class ShortCircuitOperators {
	
	public static void main(String[] args) {
		
		boolean x = true, y= false;
		
		/* Short Circuit Operators improve performance of application because
		 * if first operand fulfills operator's condition, second operator is never evaluated
		 * Short Circuit Operators = only applied to boolean types
		 * Bitwise Operators = applies to boolean and integral types
		 */ 
		if(x || y) {
			System.out.println("Inside If");
		}
	}

}
