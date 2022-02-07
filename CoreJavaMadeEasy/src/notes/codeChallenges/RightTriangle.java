package y.notes.codeChallenges;

public class RightTriangle {
	
	public static void main(String[] args) {
		
		int stars = 8;
		for(int i=1; i < stars; i++) {
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
