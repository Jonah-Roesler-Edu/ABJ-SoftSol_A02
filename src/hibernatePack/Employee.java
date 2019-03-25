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
	
	public String firstName;
	public String lastName;
	public String password;
	public String phone;
	public String address;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String _Email) {
		email = _Email;
	}
	
	public String getFName() {
		return firstName;
	}
	public void setFName(String _FName) {
		firstName = _FName;
	}
	
	public String getLName() {
		return lastName;
	}
	public void setLName(String _LName) {
		lastName = _LName;
	}
	
	public String getPass() {
		return password;
	}
	public void setPass(String _Pass) {
		password = _Pass;
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
	return "Person{ Email:" + getEmail()
	+ "; Name: " + getFName() + " " + getLName()
	+ "; Password:" + getPass()
	+ "; Address:" + getAddress()
	+ "; Phone:" + getPhone() + " }";
	}

}
