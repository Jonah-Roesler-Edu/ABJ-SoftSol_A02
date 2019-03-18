package hibernatePack;

import java.time.LocalDateTime;
import java.util.List;

public class TaskUtility {
	public static void createTask(String creatorEmail, String workerEmail, String dueDate, String txtTask) {
		Task newTask = new Task();
		newTask.setCreatorEmail(creatorEmail);
		newTask.setWorkerEmail(workerEmail);
		newTask.setTaskText(txtTask);
		
		//DateTimeFormatter format = DateTimeFormatter.ISO_DATE_TIME;
		LocalDateTime pDueDate = LocalDateTime.parse(dueDate);
		newTask.setDateDue(pDueDate);
		
		LocalDateTime assignDate = LocalDateTime.now();
		
		newTask.setDateAssign(assignDate);
		
		TaskDBManager newDB = new TaskDBManager();
		newDB.createTask(newTask);
		
	}
	
	public static List getCreatedBy(String email) {
		TaskDBManager taskDB = new TaskDBManager();
		return taskDB.listCreatedTasks(email);
	}
	
	public static List getAssignedTasks(String email) {
		TaskDBManager taskDB = new TaskDBManager();
		return taskDB.listAssignedTasks(email);
	}
}
