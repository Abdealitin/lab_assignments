package com.yash.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.Statement;

/**
 * Servlet implementation class ListDisplayController
 */
@WebServlet("/ListDisplayController")
public class ListDisplayController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();  
        response.setContentType("text/html");  
        out.println("<html><body>");
        out.println("<h1>Employees List</h1>");
        try 
        {  
            Class.forName("com.mysql.jdbc.Driver");  
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "root");  
              
            Statement stmt = (Statement) con.createStatement();  
            ResultSet rs = stmt.executeQuery("select * from emp1");  
            out.println("<table border=1 width=50% height=50%>");  
            out.println("<tr><th>Id</th><th>First Name</th><th>Last Name</th><th>Email</th><th>Contact</th><th>Address</th><tr>");  
            while (rs.next()) 
            {     
                out.println("<tr><td>" + rs.getInt(1) + "</td><td>" + rs.getString(2) + "</td><td>" + rs.getString(3) + "</td><td>" + rs.getString(4)+"</td><td>" + rs.getString(5)+"</td><td>" + rs.getString(6)+"</td></tr>");   
            }  
            out.println("</table>");  
            out.println("</html></body>");  
            con.close();  
           }  
            catch (Exception e) 
           {  
            out.println("error");  
        }  
	}

}
