package com.yash.exceptionassignment2;

import java.util.Scanner;

public class ArrayDefinedException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please Enter the size of the array:");
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		try {
			int[] array = new int[Integer.parseInt(s)];
		}catch(NumberFormatException e) {
			System.out.println("Please enter Numeric Value!");
		}catch(NegativeArraySizeException e) {
			System.out.println("Please Enter a Possitive Integer value!");
		}
		System.out.println("Your Array Successfully Created :)");
	}

}
