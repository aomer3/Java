package m.exceptionHandling.unchecked;

public class StackOverflowExceptionExample {
	
	public static void  method1() {
		System.out.println("method 1");
		method2();
	}
	
	public static void  method2() {
		System.out.println("method 2");
		method1();
	}
	
	public static void main(String[] args) {
		
		/* Stackoverflow is a Runtime exception
		 * StackOverflow Exception occurs when there isn't a proper exit condition 
		 * to program, and circular calling of methods occurs (usually see this in recursion)
		 */	
		
		method1();
		
	}

}
