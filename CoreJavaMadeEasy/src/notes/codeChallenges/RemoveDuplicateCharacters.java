package y.notes.codeChallenges;

import java.util.ArrayList;

public class RemoveDuplicateCharacters {
	
	public static void main(String[] args) {
		
		String s = "hello there this is a sentence";
		ArrayList<Character> al = new ArrayList();
		
		for(int i=0; i<s.length(); i++) {
			if(!al.contains(s.charAt(i))) {
				al.add(s.charAt(i));
			}
		}
		
		System.out.println(al);
		
	}

}
