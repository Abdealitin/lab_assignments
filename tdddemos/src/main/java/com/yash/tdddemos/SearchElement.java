package com.yash.tdddemos;

import java.util.Scanner;

public class SearchElement {

	public void search(int[] nums) throws Exception {
		if(nums.length == 10)
			System.out.println(nums);
		else
			throw new Exception("Please Enter only Ten numbers!");
	}

	public Integer search(int[] nums, int n) throws Exception {
		int counter = 0;
		if(nums.length == 10) {
			for(int i=0;i<10;i++)
				if(nums[i] == n)
					counter ++;
			return counter;
		}
		else
			throw new Exception("Please Enter only Ten numbers!");
	}
//	public void main(String []args) throws Exception {
//		int[] numbers = new int[10];
//		Scanner sc = new Scanner(System.in);
//		for(int i=0; i<10; i++) {
//			numbers[i] = sc.nextInt();
//		}
//		int key = sc.nextInt();
//		System.out.println(search(numbers,key));
//	}

}
