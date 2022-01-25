package f.flowcontrol;

public class DoWhileLoop {
	
	public static void main(String[] args) {
		
		//Do-while: use if you want to execute the body of the loop at least once (ex: menu)
		int x=1;
		
		//Although x < 1 is false, the program runs at least once
		do {
			System.out.println("Inside the loop");
		} while(x < 1);
		
		
		//Print all odd numbers between 1 and 30
		int y=1;
		do {
			if(y%2==1) {
			System.out.println(y);
			}
			y++;
		}while(y<=30);
		
	}

}
