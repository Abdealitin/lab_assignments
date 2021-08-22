package com.yash.carass.model;

public class Car {
	int registration_number;
	String owner_name;
	String type;
	String engine;
	public Car() {
		super();
	}
	public Car(int registration_number, String owner_name, String type, String engine) {
		super();
		this.registration_number = registration_number;
		this.owner_name = owner_name;
		this.type = type;
		this.engine = engine;
	}
	public int getRegistration_number() {
		return registration_number;
	}
	public void setRegistration_number(int registration_number) {
		this.registration_number = registration_number;
	}
	public String getOwner_name() {
		return owner_name;
	}
	public void setOwner_name(String owner_name) {
		this.owner_name = owner_name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getEngine() {
		return engine;
	}
	public void setEngine(String engine) {
		this.engine = engine;
	}
	@Override
	public String toString() {
		return "Car [registration_number=" + registration_number + ", owner_name=" + owner_name + ", type=" + type
				+ ", engine=" + engine + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((engine == null) ? 0 : engine.hashCode());
		result = prime * result + ((owner_name == null) ? 0 : owner_name.hashCode());
		result = prime * result + registration_number;
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (engine == null) {
			if (other.engine != null)
				return false;
		} else if (!engine.equals(other.engine))
			return false;
		if (owner_name == null) {
			if (other.owner_name != null)
				return false;
		} else if (!owner_name.equals(other.owner_name))
			return false;
		if (registration_number != other.registration_number)
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}
	
	
}
