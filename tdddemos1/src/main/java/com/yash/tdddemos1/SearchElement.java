package com.yash.tdddemos1;

import java.util.Scanner;

public class SearchElement {

	public static Integer search(int[] nums, int n) throws Exception {
		int counter=0;
		if(nums.length == 10) {
			for(int i=0; i<10; i++)
				if(nums[i] == n)
					counter++;
		}
		return counter;
	}
	public static void main(String []args) throws Exception {
		int[] nums = new int[10];
		int key;
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<10; i++) {
			nums[i] = sc.nextInt();
		}
		key = sc.nextInt();
		System.out.println(search(nums,key));
	}

}
 