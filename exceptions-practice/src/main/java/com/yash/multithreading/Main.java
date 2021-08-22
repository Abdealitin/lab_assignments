package com.yash.multithreading;

import java.util.ArrayList;

interface A{
	void x();
}
class B implements A{

	@Override
	public void x() {
		// TODO Auto-generated method stub
		
	}
	
}
class C extends B{

	@Override
	public void x() {
		// TODO Auto-generated method stub
		
	}
	
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<A> a = new ArrayList<A>();
		a.add(new B());
		a.add(new C());
		
//		System.out.println(a);
	}

}
