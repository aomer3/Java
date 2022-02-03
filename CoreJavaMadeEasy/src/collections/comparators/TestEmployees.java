package v.collections.comparators;

public class TestEmployees {
	
	public static void main(String[] args) {
		
		Employee emp1 = new Employee(1, "John");
		Employee emp2 = new Employee(2, "Sally");
		Employee emp3 = new Employee(3, "John");
		
		//Using comparable interface (in Employee object)
		String result = emp1.compareTo(emp2) == 1 ? "same" : "not the same";
		String result2 = emp1.compareTo(emp3) == 1 ? "same" : "not the same";
		System.out.println("Comparable method in Employee object:");
		System.out.println("Emp1 and Emp2 names: " + result);
		System.out.println("Emp1 and Emp3 names: " + result2);
		
		//Using object comparator interface (creating Employee comparator)
		EmployeeComparator ec = new EmployeeComparator();
		System.out.println("\nEmployee Comparator:");
		String result3 = ec.compare(emp1, emp2) == 1 ? "same" : "not the same";
		String result4 = ec.compare(emp1, emp3) == 1 ? "same" : "not the same"; 
		System.out.println("Emp1 and Emp2 names: " + result);
		System.out.println("Emp1 and Emp3 names: " + result2);
	}

}
