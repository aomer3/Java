package a.nonStaticMembers;

public class ThisKeyword {
	
	int x;
	
	ThisKeyword(){
		
		// this points to the object in memory and can be used to reference an object's
		// members (variables and methods)
		// this can only be used in a non-static context. Cannot be used in static context 
		// or in main method
		System.out.println(this);
		System.out.println(this.x);
	}
	
	public static void main(String[] args) {
		new ThisKeyword();
		new ThisKeyword();
	}

}
