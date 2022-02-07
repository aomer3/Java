package y.notes.codeChallenges;

//Reverse each word so "Hello World" is "olleH dlroW"
public class ReverseEachWord {
	
	public static void main(String[] args) {
		
		String s = "Java is awesome!!";
		
		String[] split = s.split("\\s");
				
		int i=0;
		while(i < split.length) {
			StringBuffer reverse = new StringBuffer(split[i++]).reverse();
			System.out.print(reverse +  " ");
		}
	}

}
