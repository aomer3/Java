package i.inheritance.superkeyword;

public class Child extends Parent {
	
	int c, d;
	
	Child(int a, int b, int c,int d){
		super(a,b);
		this.c = c;
		this.d = d;
	}

	void f1() {
		System.out.println("Inside Child f1");
	}
	
	void f2() {
		super.f1();
	}
	
	void displayDetails() {
		System.out.println("Parent a:" + super.a); 
		System.out.println("Parent b:" + super.b);
		System.out.println("Child c:" + this.c);
		System.out.println("Child d:" + this.d);
	}
}
