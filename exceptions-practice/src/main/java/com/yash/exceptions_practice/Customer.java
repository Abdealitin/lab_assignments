package com.yash.exceptions_practice;

import java.util.Objects;

public class Customer implements Comparable<Customer> {
	int id;
	String name;
	int quantity;
	
	@Override
	public int compareTo(Customer c) {
		// TODO Auto-generated method stub
		return this.quantity - c.quantity;
	}
	
	public Customer(int id, String name, int quantity) {
		super();
		this.id = id;
		this.name = name;
		this.quantity = quantity;
	}
	public Customer() {
		super();
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
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", quantity=" + quantity + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, quantity);
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
		return id == other.id && Objects.equals(name, other.name) && quantity == other.quantity;
	}
	
	
	
}
