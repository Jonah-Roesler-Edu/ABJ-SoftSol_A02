package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import HTML_Pages.HTML_Tasks;
import hibernatePack.EmpUtility;
import hibernatePack.Task;
import hibernatePack.TaskUtility;

/**
 * Servlet implementation class TaskPage
 */
@WebServlet("/TaskPage")
public class TaskPage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TaskPage() {
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
		
		List createdBy = TaskUtility.getCreatedBy(email);
		List assignedTo = TaskUtility.getAssignedTasks(email);
		Object[] createdTasks = createdBy.toArray(); 
		Object[] assignedTasks = assignedTo.toArray();
		
		//out.println(HTML_Tasks.writeTasks(createdTasks, assignedTasks));
		out.println(HTML_Tasks.writeHead());
		out.println(HTML_Tasks.writeCreatedTable(createdTasks));
		out.println(HTML_Tasks.writeAssignedTable(assignedTasks));
		out.println(HTML_Tasks.writeTaskForm());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		System.out.println("CREATING TASK");
		
		HttpSession session = request.getSession();
		String email = (String) session.getAttribute("email");
		
		String workerEmail = request.getParameter("email");
		String taskDesc = request.getParameter("txtTask");
		String dueDate = request.getParameter("dueDate");
		String id = request.getParameter("id");
		
		if(request.getParameter("create") != null) {
			TaskUtility.createTask(email, workerEmail, dueDate, taskDesc);
		}
		
		if(request.getParameter("complete") != null )
		{  
			//session.setAttribute("email", email);
		}
		if(request.getParameter("profile") != null) {
			response.sendRedirect("profile");
		}
	}

}
