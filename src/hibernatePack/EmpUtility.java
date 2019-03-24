package hibernatePack;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;

public class EmpUtility {
	
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
	
	public static void deleteProfile(String email, String pass) {
		Employee dEmployee = EmpUtility.getProfile(email);
		if(dEmployee.getPass().equals(pass)) {
			DBManager myDB = new DBManager();
//			myDB.del
		}
	}
	
	
}
