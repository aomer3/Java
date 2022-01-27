package i.inheritance.superkeyword;

public class SuperClass {
	
	int x;
	
	SuperClass(){
		System.out.println("No Arg SuperClass Constructor");
	}
	
	SuperClass(int x){
		this();
		this.x = x;
		System.out.println("One Arg SuperClass Constructor");
	}

}
