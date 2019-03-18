package HTML_Pages;

import hibernatePack.Task;

public class HTML_Tasks {
	public static String writeHead() {
		
		
		
		String taskPage = new String();
		taskPage = "<!DOCTYPE HTML>\r\n" + 
				"<html>\r\n" + 
				"    <head>\r\n" + 
				"    <title>Tasks</title>\r\n" + 
				"    </head>\r\n" + 
				"    <body>\r\n";
		return taskPage;
	}
	
	
	public static String writeCreatedTable(Object[] createdTasks) {
		StringBuilder tt = new StringBuilder();
		tt.append("        <div>\r\n" + 
				"            <h2>Tasks you've created</h2>\r\n");
		
		tt.append("<Table>");
		tt.append("    <tr>\r\n" + 
				"        <th>Created By</th>\r\n" + 
				"        <th>Assigned to:</th>\r\n" +
				"        <th>Assigned on</th>\r\n" + 
				"        <th>Due Date</th>\r\n" + 
				"        <th>Description</th>\r\n" + 
				"    </tr>");
		for(Object newTask : createdTasks) {
			//((Task) newTask).getCreator()
			tt.append("    <tr>\r\n" + 
					"        <td>"+ ((Task) newTask).getCreator() +"</td>\r\n" + 
					"        <td>" + ((Task) newTask).getWorker() + "</td>\r\n" + 
					"        <td>" + ((Task) newTask).getDateAssign() + "</td>\r\n" + 
					"        <td>"+ ((Task) newTask).getDateDue() + "</td>\r\n" + 
					"        <td>"+ ((Task) newTask).getTaskText() + "</td>\r\n" + 
					"    </tr>");
		}
		tt.append("</Table>");
		tt.append("            <br>\r\n" + 
				"            <input type=\"button\" name=\"delete\" value=\"Delete Task\">\r\n" + 
				"        </div>\r\n" );
		
		return tt.toString();
	}
	
	public static String writeAssignedTable(Object[] assignedTasks) {
		StringBuilder tt = new StringBuilder();
		tt.append("        <div>\r\n" + 
				"            <h2>Tasks assigned to you</h2>\r\n");
		
		tt.append("<Table>");
		tt.append("    <tr>\r\n" + 
				"        <th>Created By</th>\r\n" + 
				"        <th>Assigned to:</th>\r\n" +
				"        <th>Assigned on</th>\r\n" + 
				"        <th>Due Date</th>\r\n" + 
				"        <th>Description</th>\r\n" + 
				"    </tr>");
		for(Object newTask : assignedTasks) {
			//((Task) newTask).getCreator()
			tt.append("    <tr>\r\n" + 
					"        <td>"+ ((Task) newTask).getCreator() +"</td>\r\n" + 
					"        <td>" + ((Task) newTask).getWorker() + "</td>\r\n" + 
					"        <td>" + ((Task) newTask).getDateAssign() + "</td>\r\n" + 
					"        <td>"+ ((Task) newTask).getDateDue() + "</td>\r\n" + 
					"        <td>"+ ((Task) newTask).getTaskText() + "</td>\r\n" + 
					"    </tr>");
		}
		tt.append("</Table>");
		tt.append("            <br>\r\n" + 
				"            <input type=\"button\" name=\"complete\" value=\"Task Completed\">\r\n" + 
				"        </div>\r\n" );
		
		return tt.toString();
	}
	
	public static String writeTaskForm() {
		StringBuilder tf = new StringBuilder();
		tf.append(
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
				"</html>");
		
		return tf.toString();
	}


}
