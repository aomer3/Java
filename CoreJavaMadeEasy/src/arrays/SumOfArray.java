package t.arrays;

//This program calculates the sum of the numbers in an array
public class SumOfArray {
	
	public static void main(String[] args) {
		
		int[] arr1 = {5,3,5,6,3,5};
		int[] arr2 = {2,3,8,5,3,5,5};
		
		int sum1 = 0;
		int sum2 = 0;
		
		for (int i : arr1) {
			sum1 += i;
		}
		
		for (int i : arr2) {
			sum2 += i;
		}
		
		System.out.println("Array 1 sum: " + sum1);
		System.out.println("Array 2 sum: " + sum2);
		
		
	}

}
