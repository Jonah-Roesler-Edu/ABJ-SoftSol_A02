package hibernatePack;

public class HTML_Tasks {
	public static String writeTasks() {
		
		String taskPage = new String();
		taskPage = "<!DOCTYPE HTML>\r\n" + 
				"<html>\r\n" + 
				"    <head>\r\n" + 
				"    <title>Tasks</title>\r\n" + 
				"    </head>\r\n" + 
				"    <body>\r\n" + 
				"        <div>\r\n" + 
				"            <h2>Tasks you've created</h2>\r\n" + 
				"            <br>\r\n" + 
				"            <input type=\"button\" name=\"delete\" value=\"Delete Task\">\r\n" + 
				"        </div>\r\n" + 
				"        <div>\r\n" + 
				"            <h2>Tasks assigned to you</h2>\r\n" + 
				"            <br>\r\n" + 
				"            <input type=\"button\" name=\"complete\" value=\"Task Completed\">\r\n" + 
				"        </div>\r\n" + 
				"        <div>\r\n" + 
				"            <h2>Create a new task</h2>\r\n" + 
				"            <form method=\"post\">\r\n" + 
				"            	<p>Task Assigned to</p>\r\n" + 
				"            	<input type = \"text\" name = email>\r\n" + 
				"            	<p>Task Desc</p>\r\n" + 
				"                <input type=\"text\" name=\"txtTask\">\r\n" + 
				"                <p>Due Date</p>\r\n" + 
				"	            <input type=\"datetime-local\" name = \"dueDate\">\r\n" + 
				"	            <input type=\"submit\" name=\"create\" value=\"Create Task\">\r\n" + 
				"            </form>\r\n" + 
				"            <br>\r\n" + 
				"            <a href=\"/Dynam_Hibernate_Prototype/profile\"><button type = \"button\">Back to Profile</button></a>\r\n" + 
				"\r\n" + 
				"        </div>\r\n" + 
				"    </body>\r\n" + 
				"</html>";
		return taskPage;
	}


}
