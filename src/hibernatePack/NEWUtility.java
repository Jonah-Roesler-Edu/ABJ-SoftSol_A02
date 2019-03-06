package hibernatePack;

public class NEWUtility {
	public static boolean verifyLogin(String email, String pass) {
		
		DBManager myDB = new DBManager();
		Person uPerson = myDB.readPerson(email);
		if(uPerson.getPass().equals(pass)) {
			return true;
		}
		else {
			return false;
		}
		
		

	}
	
	public static Person getProfile(String email) {
		DBManager myDB = new DBManager();
		Person uPerson = myDB.readPerson(email);
		return uPerson;
	}
	
	public static void writeProfile(String email, String fName, String lName,String pass) {
		Person newPerson = new Person();
		newPerson.setEmail(email);
		newPerson.setFName(fName);
		newPerson.setLName(lName);
		newPerson.setPass(pass);
		DBManager myDB = new DBManager();
		myDB.createPerson(newPerson);
	}

}
