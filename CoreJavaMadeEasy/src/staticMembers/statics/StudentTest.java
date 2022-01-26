package a.staticMembers.statics;

public class StudentTest {
	
	public static void main(String[] args) {
		
		Student ahmed = new Student(105, "Ahmed");
		
		System.out.println("ID:" + ahmed.getId());
		System.out.println("Name: " + ahmed.getName());
		System.out.println("School: " + Student.getSchoolName());
	}

}
