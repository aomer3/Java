package a.nonStaticMembers;

public class ObjectReference {
	
	int x;

	public ObjectReference() {

	}
	
	public static void main(String[] args) {
		
		// Object is created (in a non-static context) that will point to a memory location 
		// where object is stored
		ObjectReference or = new ObjectReference();
		
		System.out.println(or.x);
		
	}
	

}
