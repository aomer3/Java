package i.inheritance.usecase;

public class Manager extends Employee {
	String[] projects;
	double salary;

	public Manager(int id, String name, String dept, double salary, String[] projects) {
		super(id, name, dept, salary);
		this.projects = projects;
		this.salary = salary;
	}
	
	@Override
	protected void work() {
		super.work();
		System.out.println("Manger is managing: ");
		for(int i=0; i<projects.length; i++) {
			System.out.println(projects[i]);
		}
	}

}
