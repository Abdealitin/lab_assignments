package com.yash.exceptions_practice;

import java.util.Arrays;

public class RuntimeExceptions {

	public static void main(String[] args) {
		int num1=10,num2=0;
//		try {
			System.out.println(num1/num2);
//		}catch(ArithmeticException e) {		//It occurs when we divide a number by zero
//			System.out.println(e);
//		}
		try {
			String name = "Abdeali";
			int n = Integer.parseInt(name);
		}catch(NumberFormatException e) {	//It occurs when we try to convert the String into the number format
			System.out.println(e.getMessage());	//Provides information about the exception that has occurred through a message, which is initialized in the Throwable constructor.
			System.out.println(e);
			System.out.println(e.getCause());	//Provides root cause of the exception as represented by a Throwable object.
			
		}
		try {
			String name = "";
			System.out.println(name.length());
		}catch(NullPointerException e) {	//It occurs when we try to fetch the object which is not present.
			System.out.println(e);
		}
	
		try {
			Class.forName("MyExceptions");
		} catch (ClassNotFoundException e) { 	//It occurs when we try to load a class and it does not fount in the class path 
			// TODO Auto-generated catch block
			System.out.println(e);
			StackTraceElement[] exc = e.getStackTrace();
			System.out.println(Arrays.toString(exc));	//Returns an array with each element present on the stack trace. The index 0 element will symbolize the top of the call stack, and the last element of array will identify the bottom of the call stack.
		}
		//We have another exception called NoClassDefenderFoundException which occurs when the class was present at the compile time
		//but not found at Runtime, Example If we have created the object the class and then compile it and we deleted the class before
		//running the program then at runtime compiler will not be able to create the object of that class and it throws the exception.
	}

}
