package com.yash.reflectiondemo;

import java.util.TreeSet;

//class A{
////	int a,b;
////	double y;
////	void add(int a) {
////		x=a+1;
////	}
////	void add(int i,int j) {
////		i*=2;
////		i/=2;
////	}
////	void add(double a,double b) {
////		y=a+b;
////	}
////	overload(int i, int j){
////		a=i;
////		b=j;
////	}
////	void meth(overload o) {
////		o.a*=2;
////		o.b/=2;
////	}
//	public int i;
//	public int j;
//	A(){
//		i=1;
//		j=2;
//	}
////	void display() {
////		System.out.println(i);
////	}
////	
//}
//class B extends A{
//	int j;
//	void display() {
//		super.j=3;
//		System.out.println(i+" "+j);
//	}
////	B(){
////		super();
////	}
//}
public class Overloaded_methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
////		int a=10;
////		int b= 20;
////		overload obj = new overload(a,b);
//////		obj.overload(a,a);
////		obj.meth(obj);
////		System.out.println(obj.a+" "+obj.b);
//		B obj = new B();
//		obj.i=1;
//		obj.j = 2;
////		System.out.println(obj.i+ " "+obj.j);
//		obj.display();
//		String s = "Hello";
//		String s2 = s.replace("l", "w");
////		int i = s.indexOf('o');
////		int j = s.lastIndexOf('l');
//		System.out.println(s2);
		TreeSet t = new TreeSet();
		t.add("3");
		t.add("9");
		t.add("1");
		t.add("4");
		t.add("8");
		System.out.println(t);
		
	}

}

 