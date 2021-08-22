package studentvector.model;

import java.util.Objects;

public class Student {
	int id;
	String name;
	int std;
	public Student() {
		super();
	}
	public Student(int id, String name, int std) {
		super();
		this.id = id;
		this.name = name;
		this.std = std;
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
	public int getStd() {
		return std;
	}
	public void setStd(int std) {
		this.std = std;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", std=" + std + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, name, std);
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
		return id == other.id && Objects.equals(name, other.name) && std == other.std;
	}
	
	
}
