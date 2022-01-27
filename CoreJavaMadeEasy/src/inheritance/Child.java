package i.inheritance;

public class Child extends Parent {
	Child(){
		System.out.println("Child Object location: " + this.hashCode());
	}
	void f2() {
		System.out.println("Inside f2");
	}
}
