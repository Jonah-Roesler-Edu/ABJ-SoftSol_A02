package HTML_Pages;

import hibernatePack.Employee;

public class HTML_Profile {
	public static String writeProfile(Employee newEmployee) {
		//Userdata = array {FirstName(username), Pass, LastName, Email}
		//
		String profilePage = new String();
		profilePage = 
				"<!DOCTYPE html>\r\n" + 
				"<html>\r\n" + 
				"	<head>\r\n" + 
				"		<meta charset=\"utf-8\">\r\n" + 
				"		<title>Profile Page</title>\r\n" + 
				"	</head>\r\n" + 
				"	<body>\r\n" + 
				"	<h2>Profile Page</h2>\r\n" + 
				"	<p name = \"name\">" + "Name: " + newEmployee.getFName() + " " + newEmployee.getLName() +  "</p>\r\n" + 
				"	<p name = \"phone\"> " + "Phone: " + newEmployee.getPhone() + " </p>\r\n" + 
				"	<p name = \"email\"> " + "Email: " + newEmployee.getEmail() + "</p>\r\n" + 
				"	<p name = \"address\"> " + "Address: " + newEmployee.getAddress() + "</p>\r\n" + 
				"	\r\n" + 
				//"		<a href=\"/Dynam_Hibernate_Prototype/login\"><button type=\"button\">Logout</button> </a>" + 
				"		<a href=\"/Dynam_Hibernate_Prototype/login\">" +
				"		<input type = \"submit\" name = \"logout\" value = \"logout\"/></a>" +
				"		<a href=\"/Dynam_Hibernate_Prototype/tasks\"><button type=\"button\">to Tasks</button> </a>" + 
				"	</body>\r\n" + 
				"</html>";
		return profilePage;
	}
}
