package com.yash.tdddemos1;

import java.util.Scanner;

public class ReverseString {
	public static void main(String []args) {
		String s;
		Scanner sc = new Scanner(System.in);
		s = sc.next();
		System.out.println(reverseIt(s));
	}

	private static StringBuilder reverseIt(String s) {
		StringBuilder sb = new StringBuilder();
		for(int i=s.length()-1; i>=0; i--) {
			sb.append(s.charAt(i));
		}
		return sb;
	}

}