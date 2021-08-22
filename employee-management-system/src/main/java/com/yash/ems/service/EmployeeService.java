package com.yash.ems.service;

import java.util.List;

import com.yash.ems.exception.InvalidDeptException;
import com.yash.ems.exception.InvalidIdException;
import com.yash.ems.exception.InvalidNameException;
import com.yash.ems.exception.NotEnoughRecordsException;
import com.yash.ems.model.Employee;

/**
 * Specification of the Services provided in the whole App.
 * @author Abdeali Tinwala
 *
 */
public interface EmployeeService {
	public Employee getEmpById(int id) throws InvalidIdException;
	public List<Object> getEmpByName(String name) throws InvalidNameException;
	public List<Employee> getEmpByDept(String dept) throws InvalidDeptException;
	public Employee getTopEarner();
	public List<Employee> getEmpByNameAndSalary(String name,double salary) throws InvalidNameException;
	public void getDeptList();
	public void getMaxSalary();
	public void getLimitedReords(int hasNextInt) throws NotEnoughRecordsException;
	public Double getCompleteExpenditure();
	public List<Employee> getList();
}
