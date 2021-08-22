package com.yash.inheritancepolyass.bankass;

import java.util.Objects;

public class SavingsAccount extends Account {
	
	private double interest;//additional attribute to previous attributes of class Account.
	
	public SavingsAccount(int accnum, double interest){
		super(accnum);
		this.interest=interest;
	}//end of constructor.
	
	// method to get interest.
	public double getInterest(){
		 double x=getBalance() + getBalance()*interest;
		 return x;
	}
	
	//method to set interest.
	public void setInterest(double interest){
		this.interest=interest;
	}
	
	// method to add interest to account.
	public void  AddInterest (double interest){
		double x=super.getBalance()*interest;
		super.deposit(x);
	}
	
	// override the toString() method.
	public String toString(){
		return super.toString()+" Interest : "+interest;
	}

}
