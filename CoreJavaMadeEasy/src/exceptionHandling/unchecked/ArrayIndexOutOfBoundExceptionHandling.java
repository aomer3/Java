package m.exceptionHandling.unchecked;

import java.util.Iterator;

public class ArrayIndexOutOfBoundExceptionHandling {
	
	void method() {
		System.out.println("method 1");
	}
	
	public static void main(String[] args) {
		
		int arr[] = {10,20,30};
		
		try {
			System.out.println("Elements of the array are:");
			//Array out of bound exception = trying to access an nonexistent index in an array 
			for (int i = 0; i <= arr.length; i++) { 
				System.out.println(arr[i]);
			}
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Index beyond array length");
		}
		
	}
}
