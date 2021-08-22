package com.yash.java8practice;

import java.time.LocalDateTime;
import java.util.Date;

public class Employee {
	int id;
	String name;
	String area;
	LocalDateTime joining_date;
	double salary;
	
	
	public Employee() {
		super();
	}
	public Employee(int id, String name, String area, LocalDateTime joining_date, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.area = area;
		this.joining_date = joining_date;
		this.salary=salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	
	public LocalDateTime getJoining_date() {
		return joining_date;
	}
	public void setJoining_date(LocalDateTime joining_date) {
		this.joining_date = joining_date;
	}
	
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", area=" + area + ", joining_date=" + joining_date
				+ ", salary=" + salary + "]";
	}
}
