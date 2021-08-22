package com.yash.java8demo.service;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.yash.java8demo.model.Student;

public class StudentServices {
	public ArrayList<Student> studentList(){
		ArrayList<Student> students = new ArrayList<>();
		students.add(new Student(101,"Jack",11,"PCB",89.63,"Asia/Kolkata",LocalDateTime.parse("2021-03-25T16:30:00")));
		students.add(new Student(102,"Daniel",11,"PCB",75.33,"Asia/Kolkata",LocalDateTime.parse("2017-03-25T16:30:00")));
		students.add(new Student(103,"Jane",11,"PCB",83.53,"Europe/Paris",LocalDateTime.parse("2020-03-23T16:30:00")));
		students.add(new Student(104,"Jack",11,"PCB",89.63,"America/Los_Angeles",LocalDateTime.parse("2019-02-25T16:30:00")));
		students.add(new Student(107,"Jimmy",11,"PCM",98.63,"America/Puerto_Rico",LocalDateTime.parse("2019-03-25T16:30:00")));
		students.add(new Student(110,"Den",12,"PCM",64.63,"America/Los_Angeles",LocalDateTime.parse("2020-03-25T16:30:00")));
		students.add(new Student(106,"Rose",12,"PCM",72.63,"America/Los_Angeles",LocalDateTime.parse("2019-07-25T16:30:00")));
		students.add(new Student(108,"Sam",12,"Commerce",92.72,"America/Phoenix",LocalDateTime.parse("2020-03-25T16:30:00")));
		students.add(new Student(109,"Emily",12,"Commerce",55.53,"America/Los_Angeles",LocalDateTime.parse("2021-03-25T16:30:00")));
		students.add(new Student(105,"Alita",12,"Commerce",98.63,"America/Los_Angeles",LocalDateTime.parse("2019-03-15T16:30:00")));
		
		return students;
	}
	
	public ZonedDateTime getZoneTime(Student s) {
		ZoneId zoneId = ZoneId.of(s.getRegion());
		ZonedDateTime date = ZonedDateTime.of(s.getPassedDate(), zoneId);
		return date;
	}
	
	public List<Student> sortedByName(){
		//Comparator by name using Lambda Expression
		Comparator<Student> byName = Comparator.comparing(Student::getName);
		List<Student> students = studentList().stream()
				.sorted(byName)
				.collect(Collectors.toList());
		return students;
	}
	
	public List<Student> sortedByPercentage(){
		Comparator<Student> byPercentage = Comparator.comparing(Student::getPercantage);
		List<Student> students = studentList().stream()
				.sorted(byPercentage)
				.collect(Collectors.toList());
		return students;
	}
	
	public List<Student> sortedByPassedDate(){
		Comparator<Student> byDate = Comparator.comparing(Student::getPassedDate);
		List<Student> students = studentList().stream()
				.sorted(byDate)
				.collect(Collectors.toList());
		return students;
	}
	
	public List<Student> getMoreThan90(){
		List<Student> students = studentList().stream()
				.filter(s->s.getPercantage()>=90)
				.collect(Collectors.toList());
		return students;
	}
	
	public Student getTopScorer() {
		Student s = studentList().stream().max(Comparator.comparing(Student::getPercantage)).get();
		return s;
	}
	
	public Student getLowestScorer() {
		Student s = studentList().stream().min(Comparator.comparing(Student::getPercantage)).get();
		return s;
	}
	
//	public Double getAverageResult() {
//		Optional<Student> sum = studentList().stream().reduce((sum1, student)->sum1+student.getPercantage());
//		
//		
//	}
}
