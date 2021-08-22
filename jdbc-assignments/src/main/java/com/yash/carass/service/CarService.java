package com.yash.carass.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;

import com.mysql.jdbc.log.Log;
import com.yash.carass.dao.CarDao;
import com.yash.carass.model.Car;
import com.yash.carass.util.DataUtility;

public class CarService {
	CarDao cd = new CarDao();
	public void CarEntry(int regNo, String owner, String type, String engine) throws Exception {
		int n = cd.CarEntry(regNo, owner, type, engine);
        System.out.println(n+" row(s) added");
        
	}
	
	public void getCarList() throws Exception {
		ArrayList<Car> cars	= cd.getAllCars();
		cars.stream().forEach(System.out::println);
	}
	
	public void deleteById(int id) {
		System.out.println(cd.deleteCarById(id)+" row deleted.");
	}
}
