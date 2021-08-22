package com.yash.inheritancepolyass.bankass;

import java.util.Arrays;

public class Bank {
	public static void main (String[] args) {
		Account[] acc=new Account[2];
		acc[0]=new SavingsAccount(263010,0.25);
		acc[1]=new CurrentAccount(253010,5000);
		
//	// iterating each account and implementing instructions.
//	for(int i=0; i<acc.length;i++){
//		if(acc[i]equals(SavingsAccount))
//			System.out.println(acc[i].getInterest());
//	}
//		for(int i =0; i<acc.length; i++) {
//			if(acc[i].getClass() == SavingsAccount.class) {
//				System.out.println(acc[i].getInterest());			}
//		}
		System.out.println(Arrays.toString(acc));
		
	}
}
