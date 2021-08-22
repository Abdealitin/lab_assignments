package moviebooking.model;

import java.util.Objects;

public class Customer {
	String name;
	int age;
	String contact;
	public Customer() {
		super();
	}
	public Customer(String name, int age, String contact) {
		super();
		this.name = name;
		this.age = age;
		this.contact = contact;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", age=" + age + ", contact=" + contact + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(age, contact, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		return age == other.age && Objects.equals(contact, other.contact) && Objects.equals(name, other.name);
	}
	
	
}
