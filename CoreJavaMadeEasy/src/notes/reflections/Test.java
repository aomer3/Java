package y.notes.reflections;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

//Using reflections to create and manipulate classes and objects
public class Test {
	
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException {
		
			//Loading class into memory
			Class<?> myClass = Class.forName(Calculator.class.getName());
			
			//Getting class name
			System.out.println(myClass.getName());
			
			//Getting methods
			System.out.println(Arrays.toString(myClass.getMethods()));
			
			//Getting constructors 
			Constructor<?>[] constructors = myClass.getConstructors();
			System.out.println(Arrays.toString(constructors));
			
			//Getting a specific constructor (like default here)
			Constructor<?> constructor = myClass.getConstructor(null);
			
			//Creating an object 
			System.out.println(constructor.newInstance());
			
			//Using a paramtereized constructor to create an object 
			Constructor<?> constructor2 = myClass.getConstructor(double.class, double.class);
			System.out.println(constructor2.newInstance(5,10));
			Object myObj = constructor2.newInstance(5,10);
			
			//Invoking getters to get the object values
			Method method = myClass.getMethod("getNum1", null);
			System.out.println(method);
			System.out.println(method.invoke(myObj, null));
			Method method2 = myClass.getMethod("getNum2", null);
			System.out.println(method2.invoke(myObj, null));
			
			//Invoking setters to change the object values
			Method setNum1 = myClass.getMethod("setNum1", double.class);
			setNum1.invoke(myObj, 6);
			Method setNum2 = myClass.getMethod("setNum2", double.class);
			setNum2.invoke(myObj, 8);
			System.out.println(method.invoke(myObj, null));
			System.out.println(method2.invoke(myObj, null));
			
			Method sum = myClass.getMethod("sum", int.class, int.class);
			System.out.println("Sum: " + sum.invoke(myObj, 6,10));
			Method difference = myClass.getMethod("difference", int.class, int.class);
			System.out.println("Difference: " + difference.invoke(myObj, 6,10));
			Method product = myClass.getMethod("product", int.class, int.class);
			System.out.println("Product: " + product.invoke(myObj, 6,10));
			Method quotient = myClass.getMethod("quotient", int.class, int.class);
			System.out.println("Quotient: " + quotient.invoke(myObj, 6,10));
			
			//Changing private fields to public to access them
			Field num1Field = myClass.getDeclaredField("num1");
			num1Field.setAccessible(true);
			num1Field.set(myObj, 15);
			System.out.println(method.invoke(myObj, null));
			
			//Getting annotations
			Annotation[] annotations = myClass.getAnnotations();
			System.out.println(Arrays.toString(annotations));
			
			MyAnnotation annotation = (MyAnnotation) annotations[0];
			System.out.println(annotation.value1());
			System.out.println(annotation.value2());
			
			
	}

}
