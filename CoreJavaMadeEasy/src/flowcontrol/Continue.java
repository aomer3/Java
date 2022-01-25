package f.flowcontrol;

public class Continue {
	
	public static void main(String[] args) {
		
		//Continue skips items in an iteration if condition is true
		for(int i=1; i <= 10; i++) {
			
			if(i%2==0) {
				continue;
			}
			System.out.println(i);
		}
	}

}
