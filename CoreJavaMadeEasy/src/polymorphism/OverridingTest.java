package k.polymorphism;

public class OverridingTest {
	
	public static void main(String[] args) {
		
		OverridingParent p = new OverridingParent();
		System.out.println(p.s);
		
		OverridingChild c = new OverridingChild();
		System.out.println(c.s);
		
		OverridingParent c1 = new OverridingChild();
		System.out.println(c1.s);
		c1.doSomething();
	}

}
