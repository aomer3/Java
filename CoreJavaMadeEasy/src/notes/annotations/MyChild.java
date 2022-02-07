package y.notes.annotations;

public class MyChild extends MyParent {
	
	//Overriding a method but with wrong parameter type will not throw a compile time exception
	//To avoid mistakes like this, it's best to use Override annotation
	@Override
	public String greet(String name) {
		return "Hi" + name;
	}

}
