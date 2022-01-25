package g.accessModifiers.insidethepackage;

public class A {
	
	private int a = 30;
	        int b = 40; //unmarked access modifier = default (package modifier)
	protected int c = 50;
	public int d = 60;
	
	public static void main(String[] args) {
		
		A objectA = new A();
		
		System.out.println(objectA.a);
		System.out.println(objectA.b);
		System.out.println(objectA.c);
		System.out.println(objectA.d);
		
	}

}
