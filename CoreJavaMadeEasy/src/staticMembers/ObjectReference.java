package a.staticMembers;

public class ObjectReference {
	
	//Creating a global static variable
	static ObjectReference or1 = new ObjectReference();
	
	static {
		System.out.println(or1);
		
		//Calling static method
		ObjectReference.or1 = ObjectReference.init();
	}
	
	
	//Creating an object reference in a static block
	static {
		ObjectReference or2 = new ObjectReference();
		System.out.println(or2);
	}
	
	//Creating an object reference in a static method
	static ObjectReference init() {
		return new ObjectReference();
	}
	
	public static void main(String[] args) {
		System.out.println(ObjectReference.or1);
	}

}
