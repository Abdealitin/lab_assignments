

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class EmployeeSaveController
 */
@WebServlet("/EmployeeSaveController")
public class EmployeeSaveController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession();
		String name = (String)session.getAttribute("empName");
		String contact = (String)session.getAttribute("empContact");
		
		String email = request.getParameter("email");
		String address = request.getParameter("address");
		
		//Printing the data
		out.println("Name : "+name);
		out.println("<br>Contact : "+contact);
		out.println("<br>Email : "+email);
		out.println("<br>Address : "+address);
		
	}



}
