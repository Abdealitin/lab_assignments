package com.yash.exceptionassignment2;

import java.util.Scanner;

public class IndexTest {
	
	public static void checkIndex(String[] arr, int i) throws IndexCheckException {
		if(i>=arr.length)
			throw new IndexCheckException("Not a valid Index!");
	}

	public static void main(String[] args) throws IndexCheckException {
		// TODO Auto-generated method stub
		String[] names = {"Ammy","Charlotte","Jack","Joe","Nick","Diana"};
		System.out.println("Enter any index to fetch the name:");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		checkIndex(names,i);
		System.out.print(names[i]);
		
		
	}

}
