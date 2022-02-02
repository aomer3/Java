package q.innerclasses.nonstaticInnerClass;

public class Outer {
	
	private static int x = 50;
	private int y;
	
	Outer(int y){
		this.y = y;
	}
	
	void f1() {
		System.out.println("Outer class non-static method called");
	}
	
	//Cannot define a static method inside a non-static area
	class Inner{
		private int y;
		
		Inner(int y){
			this.y = y;
		}
		
		//Using outer class variables in inner class
		void f2() {
			System.out.println("Outer class X: " + Outer.x);
			System.out.println("Outer class Y: " + Outer.this.y);
			System.out.println("Inner class Y: " + this.y);
		}
	}

	public static void main(String[] args) {
		
		Outer outer = new Outer(80);
		outer.f1();
		
		Outer.Inner inner = outer.new Inner(30);
		inner.f2();
	}
}

