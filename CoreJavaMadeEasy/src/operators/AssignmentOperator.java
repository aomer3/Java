package e.operators;

public class AssignmentOperator {
	
	public static void main(String[] args) {
		
		//Assignment
		int a = 100;
		
		//Chained assignment
		int x,y,z;
		x = y = z = 200;		
		System.out.println(x + " " + y + " " + " " + z);
		
		//Compound assignment
		a += 30;
		System.out.println(a);
		
		a -= 10;
		System.out.println(a);
		
		a *= 2;
		System.out.println(a);
		
		a /= 3;
		System.out.println(a);
		
		a %= 9;
		System.out.println(a);
		
	}

}
