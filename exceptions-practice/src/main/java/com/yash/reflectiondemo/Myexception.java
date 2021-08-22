package com.yash.reflectiondemo;

public class Myexception extends Exception{
	
	int detail;
	Myexception(int a){
		detail=a;
	}
	public String toString() {
		return "detail";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
