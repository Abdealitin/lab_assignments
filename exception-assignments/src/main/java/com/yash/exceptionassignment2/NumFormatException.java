package com.yash.exceptionassignment2;

import java.util.Scanner;

public class NumFormatException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a double value:");
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		try {
			double number = Double.parseDouble(s);
			System.out.println(number);
		}catch(NumberFormatException e) {
			System.out.println(0);
			System.out.println("Please give a valid double Value!");
		}
	}

}
