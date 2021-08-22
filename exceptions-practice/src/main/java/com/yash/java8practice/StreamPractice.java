package com.yash.java8practice;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class StreamPractice {
	public static ArrayList<Employee> getList(){
		LocalDateTime tommorow = LocalDateTime.now().minusDays(1);
		LocalDateTime previousMonthSameDay = LocalDateTime.now().minusMonths(1);
		ArrayList<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee(101, "Jack", "Asia/Kolkata", tommorow, 200000));
		employees.add(new Employee(102, "Diana","Europe/Paris", previousMonthSameDay, 30000));
		
		return employees;
	}
	public static ZonedDateTime getZoneTime(int i) {
		ArrayList<Employee> emps = getList();
		Employee e = emps.get(i);
		ZoneId zoneId = ZoneId.of(e.getArea());
		ZonedDateTime date = ZonedDateTime.of(e.getJoining_date(), zoneId);
		
		return date;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> emps = getList();
		ArrayList<Double> empSalary = (ArrayList<Double>) emps.stream()
				.filter(e->e.salary>=30000)
				.map(e->e.salary)
				.collect(Collectors.toList());
		long count = empSalary.stream().count();
		
		//Count of employees greater than 30000
		System.out.println(count);
		
		System.out.println(empSalary);
		
		System.out.println(emps);
		
		System.out.println(getZoneTime(1));
	}

}
