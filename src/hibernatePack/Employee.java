package hibernatePack;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
//import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {
	@Id
	public String email;
	
	public String fName;
	public String lName;
	public String pass;
	public String phone;
	public String address;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String _Email) {
		email = _Email;
	}
	
	public String getFName() {
		return fName;
	}
	public void setFName(String _FName) {
		fName = _FName;
	}
	
	public String getLName() {
		return lName;
	}
	public void setLName(String _LName) {
		lName = _LName;
	}
	
	public String getPass() {
		return pass;
	}
	public void setPass(String _Pass) {
		pass = _Pass;
	}
	
	public String getPhone() {
		return phone;
	}
	public void setPhone(String _Phone) {
		phone = _Phone;
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String _Address) {
		address = _Address;
	}
	@Override
	public String toString() {
	return "Person{Email:" + getEmail()
	+ ";Name: " + getFName() + " " + getLName()
	+ ";Pass:" + getPass()
	+ ";Address:" + getAddress()
	+ ";Phone:" + getPhone() + "}";
	}

}
