package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
// added one more import statement
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.text.Utilities;

import HTML_Pages.HTML_Profile;
import hibernatePack.Employee;
import hibernatePack.PersonUtility;

/**
 * Servlet implementation class ProfilePage
 */
@WebServlet("/ProfilePage")
public class ProfilePage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProfilePage() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out = response.getWriter();
		
		HttpSession session = request.getSession();
		String email = (String) session.getAttribute("email");
		
		Employee profileEmployee = PersonUtility.getProfile(email);
		
		//out.println(profilePerson.toString());
		out.println(HTML_Profile.writeProfile(profileEmployee));
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		String reqLogout = request.getParameter("logout");
		if (reqLogout != null) {
			HttpSession session = request.getSession();
			session.removeAttribute("username");
			
			PrintWriter out = response.getWriter();
			out.println("loggedout");
		}
	}

}