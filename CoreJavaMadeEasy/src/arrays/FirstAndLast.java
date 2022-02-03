package t.arrays;

//This program checks if first and last numbers of an array are the same
public class FirstAndLast {
	
	public static void main(String[] args) {
		
		int[] arr1 = {5,3,5,6,3,5};
		int[] arr2 = {2,3,8,5,3,5,5};
		
		boolean sameLettersFlag1 = false;
		boolean sameLettersFlag2 = false;
		
		if(arr1[0] == arr1[arr1.length-1]) {
			sameLettersFlag1 = true;
		}
	
	
		if(arr2[0] == arr2[arr2.length-1]) {
			sameLettersFlag2 = true;
		}
		
		
		System.out.println("Array 1 Same letters: " + sameLettersFlag1);
		System.out.println("Array 2 Same letters: " + sameLettersFlag2);
	}

}
