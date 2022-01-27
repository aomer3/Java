package i.inheritance;

public class Parent {
	
	Parent(){
		System.out.println("Parent Object location: " + this.hashCode());
	}
	void f1() {
		System.out.println("Inside Parent f1");
	}
}
