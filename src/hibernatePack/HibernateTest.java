package hibernatePack;
import java.util.List;
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
		
		DBManager myDB = new DBManager();
		Person newperson = myDB.readPerson("RonJerry@Gmail");
		
		System.out.println(newperson);
		
	}

}
