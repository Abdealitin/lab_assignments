package com.yash.carass.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.yash.carass.model.Car;
import com.yash.carass.util.DataUtility;

import jdk.internal.org.jline.utils.Log;

public class CarDao {
	ArrayList<Car> cars = new ArrayList<Car>();
	public int CarEntry(int regNo, String owner, String type, String engine) throws Exception {
		Connection con = DataUtility.connect();
		String sql = "insert into car values(?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		//setting the values for parameter of sql
        ps.setInt(1, regNo);
        ps.setString(2, owner);
        ps.setString(3, type);
        ps.setString(4, engine);
        
        int n = ps.executeUpdate();
        return n;
	}
	public ArrayList<Car> getAllCars() {
		try(Connection con = DataUtility.connect();){
			String sql = "select * from car";
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				//System.out.println("Registration number:"+rs.getString(1)+" Owner:"+rs.getString(2)+" Type:"+rs.getString(3)+" Engine:"+rs.getString(4));
				cars.add(new Car(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4)));
			} 
			return cars;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public int deleteCarById(int id) {
		String sql = "delete from car where registration_number ="+id;
		
		try(Connection con = DataUtility.connect();){
			Statement stmt  = con.createStatement();
			int n = stmt.executeUpdate(sql);
			return n;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return 0;
	}
}
 