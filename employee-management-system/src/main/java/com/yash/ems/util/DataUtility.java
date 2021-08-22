package com.yash.ems.util;


import java.sql.Connection;
import java.sql.DriverManager;

public class DataUtility {
	public static Connection connect() throws Exception{
	      Class.forName("com.mysql.jdbc.Driver");
	      Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb?autoReconnect=true&useSSL=false", "root", "root");
	      return con;      
	    }
}