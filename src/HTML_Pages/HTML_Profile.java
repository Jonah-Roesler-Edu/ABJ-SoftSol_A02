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
				"			<input type = \"submit\" name = \"update\" value = \"update account\"/>" +
				"			<input type = \"submit\" name = \"message\" value = \"Send a message\"/>" +
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
				"<form method = \"post\">\r\n" + 
				"<label for \"pass\">Enter password to delete</label>\r\n" + 
				"<input type = \"password\" id =\"pass\" name = \"pass\" >\r\n" + 
				"<input type = \"submit\" name = \"confirmDelete\" value = \"Confirm Delete\">\r\n" + 
				"</form>\r\n" + 
				"</div>\r\n" + 
				"</body>\r\n" + 
				"</html>");
		return ns.toString();
	}
	
	public static String verifyUpdate(Employee uEmployee) {
		StringBuilder ns = new StringBuilder();
		ns.append("<html>\r\n" + 
				"	<body>\r\n" + 
				"		<div>\r\n" + 
				"		<h2>Are you sure you wish to edit your account information?</h2>\r\n" + 
				"			<form method=\"post\">\r\n" + 
				"				First Name:<br>\r\n" + 
				"				<input type=\"text\" name=\"firstname\" value=\" "+ uEmployee.getFName() +" \">\r\n" + 
				"				<br>\r\n" + 
				"				Last Name:<br>\r\n" + 
				"				<input type=\"text\" name=\"lastname\" value=\" "+ uEmployee.getLName() +" \">\r\n" + 
				"				<br>\r\n" + 
				"				Phone:<br>\r\n" + 
				"				<input type=\"text\" name=\"phone\" value=\" "+ uEmployee.getPhone() + " \">\r\n" + 
				"				<br>\r\n" + 
				"				Address:<br>\r\n" + 
				"				<input type=\"text\" name=\"address\" value=\" "+ uEmployee.getAddress() +" \">\r\n" + 
				"				<br>\r\n" + 
				"				<label for \"uPass\">Enter password to update</label>\r\n" + 
				"				<input type = \"password\" id =\"uPass\" name = \"uPass\" >\r\n" + 
				"				<input type=\"submit\" name = \"confirmUpdate\" value=\"Confirm update\">\r\n" + 
				"			</form>\r\n" + 
				"		</div>\r\n" + 
				"	</body>\r\n" + 
				"</html>");
		return ns.toString();
	}
	
	
}
