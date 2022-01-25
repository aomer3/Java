package f.flowcontrol;

public class WhileLoop {
	
	public static void main(String[] args) {
		
		//While loop = use when don't know number of iterations beforehand
		int i=1;
		
		while(i <= 10) {
			System.out.println(i);
			i++;
		}
		
		//Break will prevent an infinite loop
		while(true) {
			System.out.println("Hello");
			break;
		}
	}

}
