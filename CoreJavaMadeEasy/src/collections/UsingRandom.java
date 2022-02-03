package v.collections;

import java.util.Random;

public class UsingRandom {
	
	public static void main(String[] args) {
		
		Random obj = new Random();
		
		for(int i=0; i<10; i++) { //random with lower bound 5 and upper bound 10
			int m = obj.nextInt(6) + 5; //upper and lower bounds = (max-min+1) + min
			System.out.println("M: " + m);
		}
	}

}
