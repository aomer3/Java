package i.inheritance.usecase;

public class Test {
	
	public static void main(String[] args) {
		
		String[] projects = new String[]{"Flight Reservation","Check In"};
		Manager manager = new Manager(1, "John", "Travel", 1000000, projects);
		
		System.out.println(manager.id);
		System.out.println(manager.name);
		System.out.println(manager.dept);
		System.out.println(manager.salary);
		manager.work();
		System.out.println("\n");
		
		Developer developer = new Developer(2, "Ahmed", "Travel", 200000, "Java");
		
		System.out.println(developer.id);
		System.out.println(developer.name);
		System.out.println(developer.dept);
		System.out.println(developer.salary);
		System.out.println(developer.technology);
		developer.work();
		System.out.println("\n");
		
		String[] tools = new String[] {"Postman","JUnit"};
		Tester tester = new Tester(3, "Jack", "Travel", 100000, tools);
		
		System.out.println(tester.id);
		System.out.println(tester.name);
		System.out.println(tester.dept);
		System.out.println(tester.salary);
		tester.work();
	}

}
