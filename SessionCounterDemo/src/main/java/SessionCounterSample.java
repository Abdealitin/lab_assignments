

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SessionCounterSample
 */
@WebServlet("/SessionCounterSample")
public class SessionCounterSample extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Getting Session Object
		boolean create = true;
		HttpSession session = request.getSession();
		
		//Getting the data from session object
		Integer counter = (Integer) session.getAttribute("myCounter");
		
		if(counter == null) {
			counter = 1;
		}else {
			counter++;
		}
		
		//Setting the counter in the session object after incrementing on each request
		session.setAttribute("myCounter", counter);
		
		//Printing the response
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head><title>Session Tracking</title></head>");
		out.println("<body>");
		out.println("<h1>Session Tracking App Sample Counter</h1>");
		out.println("You have hit this page "+counter+" times.");
		out.println("<br>");
		out.println("<i>your session cookie ==> "+request.getHeader("Cookie")+"</i>");
		out.println("<br> Your Seesion ID ==> "+session.getId());
		out.println("</body>");
		out.println("</html>");
	}

}
