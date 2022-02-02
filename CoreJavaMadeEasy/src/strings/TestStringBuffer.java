package r.strings;

public class TestStringBuffer {
	
	public static void main(String[] args) {
		//Capacity = how much memory space is given to an object
		StringBuffer sb1 = new StringBuffer();
		System.out.println("Default capacity:" + sb1.capacity());
		
		//As memory needs grow, the capacity automatically increases
		StringBuffer sb2 = new StringBuffer("abcdefghijklmnopqrstuvwxyz");
		System.out.println("New capacity: " + sb2.capacity());
		
		//StringBuffer is not immutable. Any changes will change the original value in the 
		//memory, instead of creating a new memory object to hold new value.
		sb1.append("All the power is within you.");
		sb1.append("You can do anything and everything.");
		
		System.out.println("Current string:" + sb1);
		System.out.println("Reverse the string: " + sb1.reverse());
		sb1.reverse();
		
		sb1.delete(0, 3);
		System.out.println("Delete from string: " + sb1);
		
		sb1.insert(0, "Some of");
		System.out.println("Insert into string: " + sb1);
	}

}
