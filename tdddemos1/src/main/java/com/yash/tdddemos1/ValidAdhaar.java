package com.yash.tdddemos1;

import java.util.Scanner;

public class ValidAdhaar {
	public static void main(String []args) {
		String[] numbers = new String[5];
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<2; i++) {
			numbers[i] = sc.next();
		}
		for(int i=0; i<2; i++) {
			String[] sp =numbers[i].split("-");
			if(sp[0].length()==4 && sp[1].length()==4 && sp[2].length()==4) {
				System.out.println(numbers[i]);
			}
		}
	}

}
