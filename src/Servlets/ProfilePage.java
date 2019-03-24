package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import HTML_Pages.HTML_Profile;
import hibernatePack.EmpUtility;
import hibernatePack.Employee;

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
		
		Employee profileEmployee = EmpUtility.getProfile(email);
		
		//out.println(profilePerson.toString());
		out.println(HTML_Profile.writeProfile(profileEmployee));
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		HttpSession session = request.getSession();
		PrintWriter out = response.getWriter();
		
		if(request.getParameter("logout") != null )
		{  
		  session.invalidate();
		  response.sendRedirect("login");
		}
		if(request.getParameter("task") != null )
		{  
		  response.sendRedirect("tasks");
		}
		if(request.getParameter("message") != null )
		{  
		  response.sendRedirect("message");
		}
		if(request.getParameter("delete") != null ) {

			out.println(HTML_Profile.verifyDelete());
		}
		if(request.getParameter("confirmDelete") != null ) {
			if(EmpUtility.deleteProfile((String) session.getAttribute("email"), request.getParameter("pass"))) {
				session.invalidate();
				response.sendRedirect("login");
			}
			else {
				out.println("Invalid Password!");
			}
		}
	}

}