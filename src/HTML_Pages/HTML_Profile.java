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
				"		<form method=\"post\">" +
				"			<input type = \"submit\" name = \"logout\" value = \"Logout\"/>" +
				"			<input type = \"submit\" name = \"task\" value = \"To Task\"/>" +
				"			<input type = \"submit\" name = \"delete\" value = \"Delete Account\"/>" +
				"		</form>" +
				"	</body>\r\n" + 
				"</html>";
		return profilePage;
	}
	
	public static String verifyDelete() {
		StringBuilder ns = new StringBuilder();
		ns.append("<html>\r\n" + 
				"<body>\r\n" + 
				"<div>\r\n" + 
				"<h2>Are you sure you wish to delete your account?</h2>\r\n" + 
				"<form>\r\n" + 
				"<label for \"pass\">Enter password to delete</label>\r\n" + 
				"<input type = \"password\" id =\"pass\" name = \"pass\" >\r\n" + 
				"<input type = \"submit\" name = \"confirmDelete\" value = \"Confirm Delete\">\r\n" + 
				"</form>\r\n" + 
				"</div>\r\n" + 
				"</body>\r\n" + 
				"</html>");
		return ns.toString();
	}
	
	
}
