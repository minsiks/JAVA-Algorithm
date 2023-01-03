package classex;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class StringTest {

	public static void main(String[] args) throws ClassNotFoundException {
		Class strClass = Class.forName("java.lang.String");
		
		Constructor[] cons = strClass.getConstructors();
		
		for(Constructor c: cons) {
			System.out.println(c);
		}
		
		Field[] fields = strClass.getFields();
		
		for (Field field : fields) {
			System.out.println(field);
		}
		Method[] methods = strClass.getMethods();
		for (Method method : methods) {
			System.out.println(method);
		}
	}

}
