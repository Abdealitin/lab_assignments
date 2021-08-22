package com.yash.inheritancepolyass;

public class Employee extends Person {
	double salary;
	int startingYear;
	String insuranceNumber;

	public Employee(String name, double salary, int startingYear, String insuranceNumber) {
		super(name);
		// TODO Auto-generated constructor stub
		this.salary = salary;
		this.startingYear = startingYear;
		this.insuranceNumber = insuranceNumber;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getStartingYear() {
		return startingYear;
	}

	public void setStartingYear(int startingYear) {
		this.startingYear = startingYear;
	}

	public String getInsuranceNumber() {
		return insuranceNumber;
	}

	public void setInsuranceNumber(String insuranceNumber) {
		this.insuranceNumber = insuranceNumber;
	}

	@Override
	public String toString() {
		return "Employee [salary=" + salary + ", startingYear=" + startingYear + ", insuranceNumber=" + insuranceNumber
				+ ", Name=" + getName() +"]";
	}
	
	
}
