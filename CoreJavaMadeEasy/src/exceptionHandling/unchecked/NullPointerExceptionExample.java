package m.exceptionHandling.unchecked;

public class NullPointerExceptionExample {
	
	static ArrayIndexOutOfBoundExceptionExample a;
		
	public static void main(String[] args) {
		
		//NullPointer Exception = trying to access methods of an object not yet created 
		NullPointerExceptionExample.a.method();
		
	}
	

	
}
