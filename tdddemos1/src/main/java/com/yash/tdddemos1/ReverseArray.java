package com.yash.tdddemos1;

import java.util.Scanner;

public class ReverseArray {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] array = new int[n];
		for(int i=0; i<n; i++) {
			array[i] = sc.nextInt();
		}
		int[] revArray = new int[n];
		int j=0;
		for(int i= n-1; i>=0; i--) {
			revArray[j] = array[i];
			j++;
		}
		for(int i=0; i<n; i++) {
			System.out.print(revArray[i]);
		}
	}

}