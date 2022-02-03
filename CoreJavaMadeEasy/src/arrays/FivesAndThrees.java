package t.arrays;

//This program will replace any 5 that follows a 5, with 0.
public class FivesAndThrees {
	public static void main(String[] args) {
		
		int[] arr1 = {5,3,5,6,3,5};
		int[] arr2 = {2,3,8,5,3,5,5};
		
		for(int i=0; i < arr1.length; i++) {
			if(arr1[i] == 3 && arr1[i+1] == 5) {
				arr1[i+1] = 0;
			}
		}
		
		for(int i=0; i < arr2.length; i++) {
			if(arr2[i] == 3 && arr2[i+1] == 5) {
				arr2[i+1] = 0;
			}
		}
		
		
		System.out.print("New Array 1: ");
		for (int element : arr1) {
			System.out.print(element);
		}
		
		System.out.println("");
		
		System.out.print("New Array 2: ");
		for (int element : arr2) {
			System.out.print(element);
		}
		
	}

}
