package employeehashmap.main;

import java.io.FileNotFoundException;
import java.io.IOException;

import employeehashmap.service.EmployeeServices;

public class EmployeeApp {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		EmployeeServices es = new EmployeeServices();
//		System.out.println(es.getList());
//		System.out.println(es.getCount());
//		System.out.println(es.checkEmpty());
//		System.out.println(es.checkKey(5));
//		System.out.println(es.getEmployeeByKey(3));
//		System.out.println(es.getEmplyeeByName("Jack"));
		es.getSerialization(2);
		es.getDeserialization();
		
	}

}
