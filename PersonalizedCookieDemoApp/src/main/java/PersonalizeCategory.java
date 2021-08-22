

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PersonalizeCategory
 */
@WebServlet("/PersonalizeCategory")
public class PersonalizeCategory extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String catPersonalize = request.getParameter("category");
		Cookie c1 = new Cookie("cCat",catPersonalize);
		c1.setMaxAge(20);
		response.addCookie(c1);
		response.sendRedirect("CategoryServlet");
	}

}
