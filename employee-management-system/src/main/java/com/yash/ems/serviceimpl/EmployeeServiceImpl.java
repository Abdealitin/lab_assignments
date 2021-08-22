package com.yash.ems.serviceimpl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.yash.ems.dao.EmployeeDAO;
import com.yash.ems.exception.InvalidDeptException;
import com.yash.ems.exception.InvalidIdException;
import com.yash.ems.exception.InvalidNameException;
import com.yash.ems.exception.NotEnoughRecordsException;
import com.yash.ems.model.Employee;
import com.yash.ems.service.EmployeeService;

/**
 * Implementation of all Employee Servies Interface
 * @author Abdeali Tinwala
 *
 */
public class EmployeeServiceImpl implements EmployeeService {
	ArrayList<Employee> emps = (ArrayList<Employee>) getList();
//	public Employee getEmpById(int id) {
//		// TODO Auto-generated method stub
//		for(Employee e:emps) {
//			if(e.getId() == id)
//				return e;
//		}
//		return null;
//	}
//
//	public List<Object> getEmpByName(String name) {
//		// TODO Auto-generated method stub
//		ArrayList<Employee> byName = new ArrayList<Employee>();
//		for(Employee e:emps) {
//			if(e.getName().equals(name))
//				byName.add(e);
//		}
//		return byName;
//	}
//
//	public List<Employee> getEmpByDept(String dept) {
//		// TODO Auto-generated method stub
//		ArrayList<Employee> byDept = new ArrayList<Employee>();
//		for(Employee e:emps) {
//			if(e.getDepartment().equals(dept))
//				byDept.add(e);
//		}
//		return byDept;
//	}
//
//	public Employee getTopEarner() {
//		// TODO Auto-generated method stub
//		Collections.sort(emps, new SalaryComparator());
//		Collections.reverse(emps);
//		return emps.get(0);
//	}
//
//	public List<Employee> getEmpByNameAndSalary(String name, double salary) {
//		// TODO Auto-generated method stub
//		ArrayList<Employee> byNameAndSal = new ArrayList<Employee>();
//		for(Employee e:emps) {
//			if(e.getName().equals(e) && e.getSalary() == salary)
//				byNameAndSal.add(e);
//		}
//		return byNameAndSal;
//	}
//
//	public void getDeptList() {
//		// TODO Auto-generated method stub
//		ArrayList<String> depts = new ArrayList<String>();
//		for(Employee e:emps) {
//			if(!depts.contains(e.getDepartment()))
//				depts.add(e.getDepartment());
//		}
//		System.out.println(depts);
//	}
//
//	public void getMaxSalary() {
//		// TODO Auto-generated method stub
//		Collections.sort(emps, new SalaryComparator());
//		Collections.reverse(emps);
//		System.out.println(emps.get(0).getSalary());
//	}
//
//	public void getLimitedReords(int hasNextInt) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	public Double getCompleteExpenditure() {
//		// TODO Auto-generated method stub
//		Double sum=(double) 0;
//		for(Employee e:emps)
//			sum += e.getSalary();
//		return sum;
//	}
	
	//Initializing the Employee List
	public List<Employee> getList() {
		// TODO Auto-generated method stub
		ArrayList<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee(101, "Jack","Trainee",20000,"SE"));
		employees.add(new Employee(102, "Diana","Trainee",21000,"SE"));
		employees.add(new Employee(103, "Daisy","Tech Lead",40000,"SE"));
		employees.add(new Employee(104, "Tom","Sr. Executive",30000,"HR"));
		employees.add(new Employee(105, "Rose","System Engineer",35000,"IT"));
		employees.add(new Employee(106, "Den","Content Creator",15000,"DM"));
		return employees;
	}
	
	public void addEmployee(int id,String name,String designation,double salary,String department) throws Exception, Exception {
		EmployeeDAO ed = new EmployeeDAO();
		int n = ed.addEmployee(id, name, designation, salary, department);
		System.out.println(n+" Employee Added!");
	}

	/* Getting an Employee detail by using ID
	* It will throw an exception if user give Invalid Id
	* @return It will return the Employee Object */
	public Employee getEmpById(int id) throws InvalidIdException{
		// TODO Auto-generated method stub
		try {
			return emps.stream().filter(e->e.getId()==id).findFirst().get();
		}catch(Exception e) {
			throw new InvalidIdException("Please Enter A Valid ID!");
		}
	}

	/* Getting an Employee detail by using Name
	* It will throw an exception if user give Invalid Name
	* @return It will return the list of Employee Object */
	public List<Object> getEmpByName(String name) throws InvalidNameException {
		// TODO Auto-generated method stub
		try {
			return emps.stream().filter(e->e.getName().equalsIgnoreCase(name)).collect(Collectors.toList());
		}catch(Exception e) {
			throw new InvalidNameException("Please Enter A Valid Name!");
		}
	}

	/* Getting an Employee detail by using Department
	* It will throw an exception if user give Invalid Department
	* @return It will return the list of Employee Object */
	public List<Employee> getEmpByDept(String dept) throws InvalidDeptException {
		// TODO Auto-generated method stub
		try {
			return emps.stream().filter(e->e.getDepartment().equalsIgnoreCase(dept)).collect(Collectors.toList());
		}catch(Exception e) {
			throw new InvalidDeptException("Please Enter A Valid Department!");
		}
	}

	//Getting the Highest Salary Earner in the Company
	public Employee getTopEarner() {
		// TODO Auto-generated method stub
		return emps.stream().max(Comparator.comparing(Employee::getSalary)).get();
	}

	/* Getting a specific Employee detail by using Name and Salary
	* It will throw an exception if user give Invalid Name and Salary
	* @return It will return the list of Employee Object */
	public List<Employee> getEmpByNameAndSalary(String name, double salary) throws InvalidNameException {
		// TODO Auto-generated method stub
		try {
			return emps.stream().filter(e->e.getName().equalsIgnoreCase(name) && e.getSalary()==salary).collect(Collectors.toList());
		}catch(Exception e) {
			throw new InvalidNameException("Please Enter A Valid Name/Salary");
		}
	}

	//Getting the List of All departments
	public void getDeptList() {
		// TODO Auto-generated method stub
		emps.stream().map(e->e.getDepartment()).distinct().collect(Collectors.toList()).forEach(System.out::println);
	}

	//Printing the Highest Salary
	public void getMaxSalary() {
		// TODO Auto-generated method stub
		Employee e = emps.stream().max(Comparator.comparing(Employee::getSalary)).get();
		System.out.println(e.getSalary());
	}

	/*Printing the specific no of records provided by user
	* It will throw an exception if the user input the limit more than the records
	* @return It will return the list of Employees with limit set by user.*/
	public void getLimitedReords(int hasNextInt) throws NotEnoughRecordsException {
		// TODO Auto-generated method stub
		if(hasNextInt<=emps.size()) {
			emps.stream().limit(hasNextInt).forEach(System.out::println);
		}else {
			throw new NotEnoughRecordsException("Not Enough Recohrds to Display!");
		}
	}

	//@return Returning the total Expenditure on the Salary
	public Double getCompleteExpenditure() {
		// TODO Auto-generated method stub
		return emps.stream().mapToDouble(e->e.getSalary()).reduce((s1,s2)->s1+s2).getAsDouble();
	}
	 
}
