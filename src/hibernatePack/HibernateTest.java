package hibernatePack;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import hibernatePack.DBManager;

public class HibernateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Person person1 = new Person();
//		person1.setEmail("123.abc@Gmail");
//		person1.setFName("John");
//		person1.setLName("Smith"); 
//		person1.setPass("123");
//		
//		Person person2 = new Person();
//		person1.setEmail("RonJerry@Gmail");
//		person1.setFName("Ron");
//		person1.setLName("James");
//		person1.setPass("456");
//		
//		DBManager myDB = new DBManager();
//		
//		myDB.createPerson(person1);
//		myDB.createPerson(person2);
		
//		Person updatePerson = myDB.readPerson("123.abc@Gmail");
//		updatePerson.setFName("Newname");
//		
//		myDB.updatePerson(updatePerson);
		
//		List<Person> personList = myDB.listPersons();
//		
//		for(Person p: personList) {
//			System.out.println(p);
//		}
		
//		DBManager myDB = new DBManager();
//		Employee newperson = myDB.readEmployee("RonJerry@Gmail");
		
//		System.out.println(newperson);
		
//		
//		Task newTask = new Task();
//		newTask.setCreatorEmail("CreatorEmail");
//		Date newDate = new Date();
//		newTask.setDateAssign(newDate);
//		newTask.setDateDue("new date due");
//		newTask.setTaskText("Create a new task");
//		newTask.setWorkerEmail("Worker.email@org");
//		
//		TaskDBManager newDB = new TaskDBManager();
//		newDB.createTask(newTask);
//		
//		System.out.println(newTask);
//	
//		Date newDate = new Date();
//		
//		String newStringDate = newDate.toString();
//		String parsenewDate = DateFormat.parse("hh:mm:ss zzz yyyy");
//
//		DateFormat df = new SimpleDateFormat("hh:mm:ss zzz yyyy", Locale);
//		Date parseDate = new Date();
//		try {
//			parseDate = df.parse(newStringDate);
//		} catch (ParseException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
//		LocalDateTime ldt = LocalDateTime.now();
//		LocalDateTime ldt2 = LocalDateTime.parse("2019-03-19T12:12");
//		ldt2.getDayOfMonth();
//		
//		System.out.println(ldt2);
		
		//List newList = TaskUtility.getCreatedBy("Hello");
		List newList = TaskUtility.getAssignedTasks("abcd");
		if(newList.isEmpty()) {
			System.out.println("No created tasks");
			Object[] newArrList = newList.toArray();
			System.out.println(newArrList.length);
		}
		else {
			System.out.println(newList);
		}
		

		
	}

}
