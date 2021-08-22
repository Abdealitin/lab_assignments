package com.yash.reflectiondemo;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;

/**
 * @author Abdeali Tinwala
 *
 */
public class ReflectionDemo {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class c = Class.forName("com.yash.reflectiondemo.Student");
		
		Constructor[] consts = c.getDeclaredConstructors();
		Constructor con = consts[1];
		con.setAccessible(true);
		Student st = (Student) con.newInstance();
		System.out.println(st);
		
//		System.out.println(c);
//		
//		System.out.println("Super Class = "+c.getSuperclass());
//		int mod  = c.getModifiers();
//		System.out.println("Modifier = "+mod);
//		
//		System.out.println("Access Specifier = "+Modifier.toString(mod));
//		
//		Class[] classes = c.getInterfaces();
//		for(Class cls:classes)
//			System.out.println("Name = "+cls+" HasCode = "+cls.hashCode());
//		
//		Field[] fields = c.getDeclaredFields();
//		for(Field f:fields)
//			System.out.println("Name = "+f+" HashCode = "+f.hashCode());
//		
//		Constructor[] consts = c.getDeclaredConstructors();
//		for(Constructor co:consts)
//			System.out.println("Name = "+co+" HashCode = "+co.hashCode());
	}

}
