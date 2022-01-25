package f.flowcontrol;

public class Switch {
	
	public static void main(String[] args) {
		
		int x=1;
		/*
		 * Data types supported in switch are (can only use these data types):
		 * -byte, short, char, int, enum, String
		 * -cannot have duplicate cases (case 1 and another case 1)
		 */
		switch(x) {
		case 1: 
			System.out.println("Case 1");
			break;
		case 2:
			System.out.println("Case 2");
			break;
		//Fall through can be implemented for cases that have common logic 
		case 4:
		case 5:
			System.out.println("Common Logic");
			break;
		default:
			System.out.println("Default");
		
		}
		
		
		int a=10;
		final int b=20;
		
		//Case values must be either literals, constants or expressions (cannot be variable)
		//Duplicate case labels not allowed. Every case label must be unique and constant
		switch(a) {
		case 10:
			System.out.println("Case 10");
			break;
		case b:
			System.out.println("Case 20");
			break;
		case 30:
			System.out.println("Case 30");
			break;
		default:
			System.out.println("No Cases");
		}
	}

}
