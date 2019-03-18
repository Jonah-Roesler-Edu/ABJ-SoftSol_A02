package hibernatePack;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;

public class PersonUtility {
	
	public static boolean verifyLogin(String email, String pass) {
		DBManager myDB = new DBManager();
		Employee uEmployee = myDB.readEmployee(email);
		if(uEmployee.getPass().equals(pass)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static Employee getProfile(String email) {
		DBManager myDB = new DBManager();
		Employee uEmployee = myDB.readEmployee(email);
		return uEmployee;
	}
	
	public static void writeProfile(String email, String fName, String lName,String pass, String address, String phone) {
		Employee newEmployee = new Employee();
		newEmployee.setEmail(email);
		newEmployee.setFName(fName);
		newEmployee.setLName(lName);
		newEmployee.setPass(pass);
		newEmployee.setAddress(address);
		newEmployee.setPhone(phone);
		DBManager myDB = new DBManager();
		myDB.createEmployee(newEmployee);
	}
	
	
	//TASKS UTILITY ================================
	
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
}