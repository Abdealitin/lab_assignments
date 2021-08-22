package com.yash.inheritancepolyass.bankass;

public class CurrentAccount extends Account {
private double limit;// additional variable to know limit of overdraft
	
	
	public CurrentAccount(int accnum, double limit){
		super(accnum);
		this.limit=limit;
	}//end of constructor.
	
	// method to get Limit.
	public double getLimit(){
		return this.limit;
	}
	
	//method to set limit.
	public void setLimit(double limit){
		this.limit=limit;
	}
	//method to withdraw limit only
	public void withdraw( double limit){
		if(limit<=this.limit)
			super.withdraw(limit);
		else{
			System.out.println(" Sorry, Limit Exceeded" );
		}
	}// end method.
	
	// override the toString() method.
	public String toString(){
		return super.toString()+" Limit : "+limit;
	}
}
