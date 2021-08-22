

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class EmployeeNextController
 */
@WebServlet("/EmployeeNextController")
public class EmployeeNextController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	


	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String contact = request.getParameter("contact");
		HttpSession session = request.getSession();
		session.setAttribute("empName", name);
		session.setAttribute("empContact", contact);
		ServletContext app = getServletContext();
		app.getRequestDispatcher("/employee.html").forward(request, response);
	}

}
