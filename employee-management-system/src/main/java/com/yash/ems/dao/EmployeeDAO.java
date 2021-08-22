package com.yash.ems.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.yash.ems.util.DataUtility;

public class EmployeeDAO {
	public int addEmployee(int id,String name,String designation,double salary,String department) throws SQLException, Exception {
		try(Connection con = DataUtility.connect();){
			String sql = "insert into employee1 values(?,?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setString(3, designation);
			ps.setDouble(4, salary);
			ps.setString(5, department);
			
			return ps.executeUpdate();
		}
	}
}
