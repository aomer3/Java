package v.collections.generics;

import java.util.ArrayList;

public class WildCardParams {
	
	//using ArrayList<?> will only accept null, makes the class read-only
	//extends keyword will allow for more data types to be added to arraylist
	//super keyword allows the class itself and its parents only - allows allows objects to be added to list
	public void myMethod(ArrayList<? super B> l) {
		l.add(null);
		l.add(new B());
	}
	
	public static void main(String[] args) {
		
		WildCardParams wcp = new WildCardParams();
		wcp.myMethod(new ArrayList<A>());
	}

}
