package com.yash.tdddemos1;

import java.util.Scanner;

public class ValidTelephoneNumber {
	public static void main(String []args) {
		String std = "0755";
		String[] numbers = new String[5];
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<2; i++) {
			numbers[i] = sc.next();
		}
		for(int i=0; i<2; i++) {
			String[] sp =numbers[i].split("-");
			if(sp[0].equals(std) && sp[1].length()==6) {
				System.out.println(numbers[i]);
			}
		}
	}

}
