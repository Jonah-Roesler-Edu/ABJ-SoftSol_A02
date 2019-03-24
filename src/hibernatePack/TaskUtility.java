package hibernatePack;

import java.time.LocalDateTime;
import java.util.List;

public class TaskUtility {
	public static void createTask(String creatorEmail, String workerEmail, String dueDate, String txtTask) {
		Task newTask = new Task();
		newTask.setCreatorEmail(creatorEmail);
		newTask.setWorkerEmail(workerEmail);
		newTask.setTaskText(txtTask);

		// DateTimeFormatter format = DateTimeFormatter.ISO_DATE_TIME;
		LocalDateTime pDueDate = LocalDateTime.parse(dueDate);
		newTask.setDateDue(pDueDate);

		LocalDateTime assignDate = LocalDateTime.now();

		newTask.setDateAssign(assignDate);

		String defaultStatus = "Not Completed";
		newTask.setStatus(defaultStatus);

		TaskDBManager newDB = new TaskDBManager();
		newDB.createTask(newTask);

	}

	public static Task getTask(long taskId) {
		TaskDBManager taskDB = new TaskDBManager();
		Task rTask = taskDB.readTask(taskId);
		return rTask;
	}

	public static void updateTaskStatus(long taskId) {
		TaskDBManager taskDB = new TaskDBManager();
		Task updateTask = TaskUtility.getTask(taskId);

		String status = "Complete";
		updateTask.setStatus(status);

		TaskDBManager newDB = new TaskDBManager();
		newDB.updateTask(updateTask);
	}
	public static void deleteTaskStatus(long taskId) {
		TaskDBManager taskDB = new TaskDBManager();
		Task deleteTask = TaskUtility.getTask(taskId);

		TaskDBManager newDB = new TaskDBManager();
		newDB.deleteTask(deleteTask);
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
