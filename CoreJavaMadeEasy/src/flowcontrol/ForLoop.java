package f.flowcontrol;

public class ForLoop {
	
	public static void main(String[] args) {
		
		for(int i=1; i <= 20; i++) {
			System.out.println(i);
		}
		
		
		//The for loop initialization, conditional and incrementing statements are not
		//required inside the for parenthesis 
		int a=0;
		for(;;) {
			if(a < 10) {
			System.out.println(a);
			a++;
			}
		}
	}

}
