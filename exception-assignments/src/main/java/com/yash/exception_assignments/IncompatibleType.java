package com.yash.exception_assignments;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class IncompatibleType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = new int[10];
		try (Scanner sc = new Scanner(System.in)) {
			for(int i= 0; i<10; i++) {
				numbers[i]=sc.nextInt();
			}
			//String[] copy = Arrays.copyOf(numbers, 5);
		}catch(InputMismatchException e) {
			System.out.println("Enter only numbers!");
		}
	}

}
