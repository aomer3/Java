package m.exceptionHandling.unchecked;

public class MultiCatch {
	
	public static void main(String[] args) {
		
		try {
		String[] numbers = new String[3];
		numbers[0] = "10"; 
		numbers[1] = "20";
		numbers[2] = "30";
		
		String input = numbers[2];
		
		System.out.println("Input: " + input);
		
		int output = Integer.parseInt(input);
		
		System.out.println("Output: " + output);
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Index beyond array length");
		} catch(NumberFormatException e) {
			System.out.println("Array input must be an integer.");
		}
		
		System.out.println("More code here");
		
		
	}

}
