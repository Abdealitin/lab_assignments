package com.yash.ems.comparators;

import java.util.Comparator;

import com.yash.ems.model.Employee;

public class SalaryComparator implements Comparator<Employee> {

	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		if(o1.getSalary()<o2.getSalary())
			return -1;
		if(o1.getSalary()>o2.getSalary())
			return 1;
		return 0;
	}
	
}
