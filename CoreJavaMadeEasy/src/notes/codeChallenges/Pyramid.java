package y.notes.codeChallenges;

public class Pyramid {
	
	public static void main(String[] args) {
		
		int stars = 7;
		
		for(int i=0; i<stars; i++) {
			for(int j=1; j<=stars-i; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
			
		}
	}

}
