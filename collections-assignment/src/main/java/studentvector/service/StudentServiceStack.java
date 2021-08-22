package studentvector.service;

import java.util.Iterator;
import java.util.Stack;

import studentvector.model.Student;

public class StudentServiceStack {
	Stack<Student> studs = getList();
	
	public Stack<Student> getList(){
		Stack<Student> studs = new Stack<Student>();
		studs.push(new Student(101,"Jack",11));
		studs.push(new Student(102,"Diana",11));
		studs.push(new Student(103,"Ron",12));
		studs.push(new Student(104,"Romilda",12));
		studs.push(new Student(105,"Rose",12));
		return studs;
	}
	
	public void printList() {
		Iterator<Student> value = studs.iterator();
		while(value.hasNext()) {
			System.out.println(value.next());
		}
	}
	
	public void addStudent(int id, String name, int std) {
		studs.push(new Student(id,name,std));
	}
	
	public int getCapacity() {
		return studs.capacity();
	}
	
	public int getSize() {
		return studs.size();
	}
	
	public Student getSecondStudent() {
		Student s = studs.get(2);
		return s;
	}
	
	public void setStadard(int i) {
		Student s = studs.get(2);
		s.setStd(i);
	}
}
