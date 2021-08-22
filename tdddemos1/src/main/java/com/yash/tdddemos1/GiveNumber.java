package com.yash.tdddemos1;

import java.util.Scanner;

public class GiveNumber {

	public static Integer getOdd(int[] nums) {
		int counter=0;
		for(int i=0; i<nums.length; i++) {
			if(nums[i]%2 != 0)
				counter++;
		}
		return counter;
	}

	public static Integer getEven(int[] nums) {
		int counter=0;
		for(int i=0; i<nums.length; i++) {
			if(nums[i]%2 == 0)
				counter++;
		}
		return counter;
	}

	public static Integer getNegative(int[] nums) {
		int counter=0;
		for(int i=0; i<nums.length; i++) {
			if(nums[i] < 0)
				counter++;
		}
		return counter;
	}

	public static Integer getPositive(int[] nums) {
		int counter=0;
		for(int i=0; i<nums.length; i++) {
			if(nums[i] > 0)
				counter++;
		}
		return counter;
	}

	public static void main(String []args) {
		int[] array = new int[15];
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<15; i++) {
			array[i] = sc.nextInt();
		}
		System.out.println("Odd:-"+getOdd(array)+"\nEven:-"+getEven(array)+"\nNegatives:-"+getNegative(array)+"\nPositives:-"+getPositive(array));
	}

}
