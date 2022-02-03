package v.collections.comparators;

public class Employee implements Comparable<Employee> {
	
	private int id;
	private String name;
	
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public int compareTo(Employee o) {
		if(this.name.equals(o.getName())) {
			return 1;
		}
		
		return -1;
	}
	
	

}
