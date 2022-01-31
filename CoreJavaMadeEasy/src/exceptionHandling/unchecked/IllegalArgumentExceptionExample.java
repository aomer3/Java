package m.exceptionHandling.unchecked;

public class IllegalArgumentExceptionExample {
	
	//Illegal Argument Exception = useful for checking for validations 
	public int sum(int a, int b) {
		if(a==0 || b==0) {
			throw new IllegalArgumentException("Inputs should not be zero.");
		}
		return a+b;
	}
	
	public static void main(String[] args) {
		
		IllegalArgumentExceptionExample iae = new IllegalArgumentExceptionExample();
		
		int num1 = 0;
		int num2 = 4;
		
		iae.sum(num1, num2);
		
	}

}
