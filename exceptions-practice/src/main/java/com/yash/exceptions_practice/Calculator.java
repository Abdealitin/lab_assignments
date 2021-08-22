package com.yash.exceptions_practice;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=20;
		int b=0;
		
		ExpresionsMethods em = new ExpresionsMethods();
		int sum = em.add(a, b);
		System.out.println("Sum is : "+sum);
		int sub = em.sub(a, b);
		System.out.println("Subtraction is : "+sub);
		double div = em.div(a, b);
		System.out.println("Division is : "+div);
	}

}
