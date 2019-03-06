package hibernatePack;

public class HTML_Profile {
	public static String writeProfile(String[] userData) {
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
				"	<p name = \"name\">" + userData[0] + " " + userData[2] +  "</p>\r\n" + 
				"	<p name = \"password\"> " + userData[1] + " </p>\r\n" + 
				"	<p name = \"email\"> " + userData[3] + "</p>\r\n" + 
				"	\r\n" + 
				"		<a href=\"/Dynam_Hibernate_Prototype/login\"><button type=\"button\">Logout</button> </a>" + 
				"		<input type = \"submit\" name = \"logout\" value = \"logout\"/>" +
				"	</body>\r\n" + 
				"</html>";
		return profilePage;
	}
}
