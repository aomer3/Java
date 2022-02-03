package t.arrays;

public class Arrays {
	
	public static void main(String[] args) {
		
		//Creating an array
		//Method 1: new key word to declare + no initialization
		int arr[] = new int[5];
		
		//Method 2: declaration + initialization same line
		int arr2[] = {10,20,30,40,50};
		
		//Initializing an array
		arr[0] = 10;
		
		//Displaying contents of an array
		//Method 1: for loop
		System.out.println("Displaying with for loop:");
		for(int i=0; i <arr.length; i++) {
			System.out.println(arr[i]); //default int zero assigned for each unassigned index
		}
		
		//Method 2: foreach loop (better suited for arrays)
		System.out.println("Displaying with foreach loop:");
		for (int  element : arr2) {
			System.out.println(element);
		}
				
		
	}

}
