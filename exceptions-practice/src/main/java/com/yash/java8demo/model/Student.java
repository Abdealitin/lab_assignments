package com.yash.java8demo.model;

import java.time.LocalDateTime;
import java.util.Objects;

public class Student {
	int rollNo;
	String name;
	int std;
	String stream;
	double percantage;
	String region;
	LocalDateTime passedDate;
	public Student() {
		super();
	}
	public Student(int rollNo, String name, int std, String stream, double percantage,String region, LocalDateTime passedDate) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.std = std;
		this.stream = stream;
		this.percantage = percantage;
		this.passedDate = passedDate;
		this.region = region;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStd() {
		return std;
	}
	public void setStd(int std) {
		this.std = std;
	}
	public String getStream() {
		return stream;
	}
	public void setStream(String stream) {
		this.stream = stream;
	}
	public double getPercantage() {
		return percantage;
	}
	public void setPercantage(double percantage) {
		this.percantage = percantage;
	}
	public LocalDateTime getPassedDate() {
		return passedDate;
	}
	public void setPassedDate(LocalDateTime passedDate) {
		this.passedDate = passedDate;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", std=" + std + ", stream=" + stream + ", percantage="
				+ percantage + ", region=" + region + ", passedDate=" + passedDate + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(name, passedDate, percantage, region, rollNo, std, stream);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(name, other.name) && Objects.equals(passedDate, other.passedDate)
				&& Double.doubleToLongBits(percantage) == Double.doubleToLongBits(other.percantage)
				&& Objects.equals(region, other.region) && rollNo == other.rollNo && std == other.std
				&& Objects.equals(stream, other.stream);
	}
	
	
	
	
}
