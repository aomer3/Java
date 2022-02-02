package r.strings;

public class MyImmutable {
	
	int x;
	
	MyImmutable(int x){
		this.x = x;
	}
	
	//This is how immutability works. If value is the same, reuse object
	//If value different, create new object
	public MyImmutable change(int x) {
		if(this.x == x) {
			return this;
		}
		else {
			return new MyImmutable(x);
		}
	}
	
	public static void main(String[] args) {
		
		MyImmutable mi1 = new MyImmutable(5);
		MyImmutable mi2 = mi1.change(10);
		MyImmutable mi3 = mi1.change(5);
		
		System.out.println("MI1: " + mi1.hashCode());
		System.out.println("MI2: " + mi2.hashCode());
		System.out.println("MI3: " + mi3.hashCode());
	}

}
