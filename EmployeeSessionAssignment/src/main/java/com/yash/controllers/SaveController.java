package com.yash.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SaveController
 */
@WebServlet("/SaveController")
public class SaveController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String email = request.getParameter("email");
		String contact = request.getParameter("contact");
		String address = request.getParameter("address");
		
		PrintWriter out = response.getWriter();
		
		ServletContext context = getServletContext();
		String url = context.getInitParameter("URL");
		String driver = context.getInitParameter("DRIVER");
		String user = context.getInitParameter("USERNAME");
		String pass = context.getInitParameter("PASSWORD");
		int counter = (int)(Math.random()*(500-1+1)+1);
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,user,pass);
			String sql = "insert into emp1 values(?,?,?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, counter);
			ps.setString(2, fname);
			ps.setString(3, lname);
			ps.setString(4, email);
			ps.setString(5, contact);
			ps.setString(6, address);
			
			int n = ps.executeUpdate();
			out.println(n+" Employee Added");
			
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		response.setContentType("text/html");
		out.println("<html><body>");
		out.println("<br><a href='ListDisplayController'>See List</a>");
		out.println("</body></html>");
	}

}
