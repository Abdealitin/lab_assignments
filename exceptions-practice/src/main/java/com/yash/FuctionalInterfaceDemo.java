package com.yash;

@FunctionalInterface
interface funinterface {
	public void add();
	//public void div();
	static void show() {
		System.out.print("Static method.");
	}
	default void showMessage() {
		System.out.println("Default Method");
	}
}


public class FuctionalInterfaceDemo implements funinterface{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FuctionalInterfaceDemo fi = new FuctionalInterfaceDemo();
		fi.add();
		fi.showMessage();
		funinterface.show();
		//funinetrface.show();
	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("Overriding add");
	}

}
