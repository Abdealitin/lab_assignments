package employeehashmap.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import employeehashmap.model.Employee;

public class EmployeeServices {
	
	
	public HashMap<Integer,Employee> getList(){
		HashMap<Integer,Employee> employees = new HashMap<Integer,Employee>();
		employees.put(1, new Employee(101, "Jack","Trainee",20000,"SE"));
		employees.put(2, new Employee(102, "Diana","Trainee",21000,"SE"));
		employees.put(3, new Employee(103, "Daisy","Tech Lead",40000,"SE"));
		employees.put(4, new Employee(101, "Tom","Sr. Executive",30000,"HR"));
		employees.put(5, new Employee(101, "Rose","System Engineer",35000,"IT"));
		employees.put(6, new Employee(101, "Den","Content Creator",15000,"DM"));
		
		return employees;
	}
	
	public int getCount() {
		HashMap<Integer,Employee> employees = getList();
		return employees.size();
	}
	
	public boolean checkEmpty() {
		HashMap<Integer,Employee> employees = getList();
		return employees.isEmpty();
	}
	
	public boolean checkKey(int i) {
		HashMap<Integer,Employee> employees = getList();
		boolean result = employees.containsKey(i);
		return result;
	}
	
	public Employee getEmployeeByKey(int i) {
		HashMap<Integer,Employee> employees = getList();
		Employee e = employees.get(i);
		return e;
	}
	
	public Employee getEmplyeeByName(String name) {
		HashMap<Integer,Employee> employees = getList();
		Set entrySet = employees.entrySet();
		Iterator value = entrySet.iterator();
		while(value.hasNext()) {
			Map.Entry me = (Map.Entry)value.next();
			Employee e = (Employee) me.getValue();
			if (e.getName().equals(name)) {
				return e;
			}
		}
		return null;
	}
	
	public void getSerialization(int i) throws FileNotFoundException, IOException {
		HashMap<Integer,Employee> employees = getList();
		Employee e = employees.get(i);
		File file = new File("data.ser");
		try(FileOutputStream fstream = new FileOutputStream(file);
				ObjectOutputStream ostream = new ObjectOutputStream(fstream);) {
			ostream.writeObject(e);
		}
	}
	
	public void getDeserialization() throws Exception {
		File file = new File("data.ser");
		try(FileInputStream fin = new FileInputStream(file);
				ObjectInputStream oin = new ObjectInputStream(fin);){
			Employee e = (Employee) oin.readObject();
			System.out.println(e);
			}
	}
}
