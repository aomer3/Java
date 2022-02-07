package y.notes.reflections;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

//Different ways of creating an object
public class Student {
	
	Student(){
		System.out.println("Student object created.");
	}
	
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException, CloneNotSupportedException {
		
		//Using new keyword
		Student student = new Student();
		
		//Using class (reflections) -- deprecated, don't use this
		Student student2 = (Student) Class.forName("y.notes.reflections.Student").newInstance();
	
		//Using constructor (reflections) -- recommended way of doing it when using reflections
		Student student3 = Student.class.getConstructor().newInstance();
		
		//Using clone to copy an existing object
		Student student4 = (Student) student.clone();
	}

}
