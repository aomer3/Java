package s.iostreams.serialization;

import java.io.Serializable;

public class Employee implements Serializable {
	
	int id;
	String name;
	double salary;
	transient int ssn; //transient = will not serialize this field to a file
	
	public Employee(int id, String name, double salary, int ssn) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.ssn = ssn;
	}
	
	

}
