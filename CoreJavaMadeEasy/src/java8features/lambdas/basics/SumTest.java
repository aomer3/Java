package x.advancedTopics.java8features.lambdas.basics;

public class SumTest {
	
	public static void main(String[] args) {
		
		Sum s = (x,y)-> System.out.println("Sum is: " + (x+y));
		s.add(10,20);
	}

}
