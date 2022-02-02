package s.iostreams;

import java.util.StringTokenizer;

//String Tokenizer is an alternative to string split, but perferable to use string split
//because it's easier to work with
public class StringTokenizers {
	
	public static void main(String[] args) {
		
		String s = "You,are,the,creator,of,your,destiny";
		
		StringTokenizer st = new StringTokenizer(s, ",",true); //the true boolean will return the delimeter as well
		
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}

}
