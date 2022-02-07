package y.notes.annotations;

//Deprecated = lets other developer know to not use this class/method/field because it may
//be removed in the future 
public class A {
	
	@Deprecated
	private String name;
	
	@Deprecated
	public String getName() {
		return this.name;
	}
	
	@Deprecated
	public void setName(String name) {
		this.name = name;
	}
	
	@Deprecated
	public void myMethod() {
		
	}
	
	public void myMethod2() {
		
	}
	

}
