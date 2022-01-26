package a.staticMembers.statics;

public class Student {
	
	static String schoolName;
	
	int id;
	String name;
	
	static {
		schoolName = "George Mason University";
	}

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public static String getSchoolName() {
		return schoolName;
	}

	public static void setSchoolName(String schoolName) {
		Student.schoolName = schoolName;
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
	
}
