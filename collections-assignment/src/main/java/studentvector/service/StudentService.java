package studentvector.service;

import java.util.Iterator;
import java.util.Vector;

import studentvector.model.Student;

public class StudentService {
	Vector<Student> studs = getList();
	
	public Vector<Student> getList(){
		Vector<Student> studs = new Vector<Student>();
		studs.add(new Student(101,"Jack",11));
		studs.add(new Student(102,"Diana",11));
		studs.add(new Student(103,"Ron",12));
		studs.add(new Student(104,"Romilda",12));
		studs.add(new Student(105,"Rose",12));
		
		return studs;
	}
	
	public void addStudent(int id, String name, int std) {
		studs.add(new Student(id,name,std));
	}
	
	public void printList() {
		Iterator<Student> value = studs.iterator();
		while(value.hasNext())
			System.out.println(value.next());
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
