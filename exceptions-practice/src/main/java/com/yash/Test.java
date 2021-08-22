package com.yash;

import java.io.IOException;
import java.util.Stack;

class Parent{
	public void test() throws IOException {
		System.out.println("Base");
	}
}
//class Child extends Parent{
//	public void hello() {
//		System.out.println("Derived::hello() called");
//	}
//}
public class Test {

//	public Test() {
//		// TODO Auto-generated constructor stub
//	}
//	public int testMethod() {
//		int i=0;
//		try {
//			i=100/0;
//			return 1;
//		}catch(Exception e) {
//			i=200;
//			return 1;
//		}finally {
//			i=300;
//			return 1;
//		}
//	}
	public static void main(String []args) throws IOException {
		//int r= new Test().testMethod();
		Stack<Integer> obj= new Stack<>();
		obj.push(3);
		obj.push(2);
		obj.pop();
		obj.push(5);
		System.out.println(obj);
		//System.out.println(x.equals(y));
		//System.out.print(0.0 % 0.0);
		//c.hello();
	}
//	static boolean some() {
//		while(true) {
//			try { return true;}
//			finally { break; }
//		}
//		return false;
//	}
}
