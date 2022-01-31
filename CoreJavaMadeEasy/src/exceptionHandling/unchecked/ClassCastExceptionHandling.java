package m.exceptionHandling.unchecked;

public class ClassCastExceptionHandling {
	
	public static void main(String[] args) {
		
		Object object = new Object();
		
		if(object instanceof String) {
		//Class Cast Exception = happens when trying to improperly cast one data type to another
		String s = (String) object;
		}
	}

}
