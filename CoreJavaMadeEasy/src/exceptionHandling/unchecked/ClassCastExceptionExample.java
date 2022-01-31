package m.exceptionHandling.unchecked;

public class ClassCastExceptionExample {
	
	public static void main(String[] args) {
		
		Object object = new Object();
		
		//Class Cast Exception = happens when trying to improperly cast one data type to another
		String s = (String) object;
	}

}
