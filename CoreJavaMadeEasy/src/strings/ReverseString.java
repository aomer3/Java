package r.strings;

public class ReverseString {
	
	public String firstWay(String s) {
		String reverse = "";
		for (int i = s.length()-1; i >= 0; i--) {
			reverse += s.charAt(i);
		}
		return reverse;
	}
	
	public String secondWay(String s) {
		byte[] string = s.getBytes();
		byte[] reverse = new byte[string.length];
		
		for (int i = 0; i < string.length; i++) {
			reverse[i] = string[string.length-i-1];
		}	
		return new String(reverse);
	}
	
	public static void main(String[] args) {
		
		String s1 = "Ahmed";
		
		ReverseString rs = new ReverseString();
		
		String result1 = rs.firstWay(s1);
		System.out.println(result1);
		
		String result2 = rs.secondWay(s1);
		System.out.println(result2);
	}

}
