package com.yash.ems.main;

import java.util.Scanner;

import com.yash.ems.exception.InvalidIdException;
import com.yash.ems.serviceimpl.EmployeeServiceImpl;

/**
 * This is Main class containing the UI of the Project
 * @author Abdeali Tinwala
 *
 */
public class main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		EmployeeServiceImpl e = new EmployeeServiceImpl();

		int c = 0;
		while(c==0) {
			System.out.println("/*Please choose any one option using numbers*\\"
					+ "\n1. Get Employee by Name"
					+ "\n2. Get Employees by Department"
					+ "\n3. Get the highest paid Employee"
					+ "\n4. Get the Employee by Name and Salary"
					+ "\n5. Get the List of Departments"
					+ "\n6. Get the Maximun Salary"
					+ "\n7. Get the total Expenditure on Employee Salary"
					+ "\n8. Get Employe by ID"
					+ "\n9. Get limited records"
					+ "\n10. Add Employee"
					+ "\n11. Exit");
			Scanner sc = new Scanner(System.in);
			int choice = sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter the name of the Employee:");
				String name = sc.next();
				System.out.println("Details of the Employee(s)");
				System.out.println(e.getEmpByName(name));
				break;
			
			case 2:
				System.out.println("Enter the Department Name :");
				String dept = sc.next();
				System.out.println("Details of the Employee(s)");
				System.out.println(e.getEmpByDept(dept));
				break;
				
			case 3:
				System.out.println("Highest Paid Employee is : ");
				System.out.println(e.getTopEarner());
				break;
				
			case 4:
				System.out.println("Enter the Name and Salary respectively:");
				String name1 = sc.next();
				double salary = sc.nextDouble();
				System.out.println("Details of the Employee(s) : ");
				System.out.println(e.getEmpByNameAndSalary(name1, salary));
				break;
				
			case 5:
				System.out.println("Departments in the Organization are: ");
				e.getDeptList();
				break;
				
			case 6:
				System.out.println("Maximum salary is: ");
				e.getMaxSalary();
				break;
				
			case 7:
				System.out.println("Total Expenditure on the Employee Salary is :");
				System.out.println(e.getCompleteExpenditure());
				break;
				
			case 8:
				System.out.println("Enter the ID of the Employee:");
				int id = sc.nextInt();
				System.out.println("Details of the Employee(s)");
				System.out.println(e.getEmpById(id));
				break;
				
			case 9:
				System.out.println("Enter a limit of records: ");
				int i = sc.nextInt();
				System.out.println("Details of the Employee(s)");
				e.getLimitedReords(i);
				break;
			case 10:
				System.out.println("Enter Employee ID:");
				int id1 = sc.nextInt();
				System.out.println("Enter Employee Name:");
				String name11 = sc.next();
				System.out.println("Enter Employee Designation:");
				String des = sc.next();
				System.out.println("Enter Employee Salary:");
				double sal = sc.nextDouble();
				System.out.println("Enter Employee Department:");
				String dep = sc.next();
				e.addEmployee(id1, name11, des, sal, dep);
				break;
			case 11:
				c++;
				break;
			}	
		}
		System.out.println("Have A Nice Day :)");
			
	}

}
