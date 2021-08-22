package com.yash.java8demo;

import java.util.ArrayList;

import com.yash.java8demo.model.Student;
import com.yash.java8demo.service.StudentServices;

public class SBInternational {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentServices ss = new StudentServices();
		ArrayList<Student> students = ss.studentList();
		
		System.out.println(ss.getMoreThan90());
		System.out.println(ss.sortedByPassedDate());
		System.out.println(ss.getTopScorer());
		System.out.println(ss.getLowestScorer());
		
	}

}
