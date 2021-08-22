package com.yash.inheritancepolyass;

public class Bank {
	int acnum;
	double balance;
	
	public double getBalance() {
		return 0;
	}
	class SBI{
		public double getBalance() {
			return 1000;
		}
	}
	class HDFC{
		public double getBalance() {
			return 1500;
		}
	}
	class KOTAK{
		public double getBalance() {
			return 2000;
		}
	}
	
	public static void main(String []args) {
		Bank b = new Bank();
		Bank.SBI sb = b.new SBI();
		Bank.HDFC hdfc = b.new HDFC();
		Bank.KOTAK kotak = b.new KOTAK();
		
		System.out.println(sb.getBalance());
		System.out.println(hdfc.getBalance());
		System.out.println(kotak.getBalance());
	}
}
