package hibernatePack;

public class HTML_Register {
	public static String writeHead() {
		String head = new String();
		head = "<!DOCTYPE html>\r\n" + 
				"<html>\r\n" + 
				"	<head>\r\n" + 
				"		<meta charset=\"utf-8\">\r\n" + 
				"		<title></title>\r\n" + 
				"	</head>\r\n" + 
				"	<body>\r\n" + 
				"		<h2>Register</h2>\r\n" + 
				"\r\n" + 
				"		<form method=\"post\">\r\n" + 
				"  			First Name:<br>\r\n" + 
				"  			<input type=\"text\" name=\"firstname\" value=\"\">\r\n" + 
				"  			<br>\r\n" + 
				"  			Last Name:<br>\r\n" + 
				"  			<input type=\"text\" name=\"lastname\" value=\"\">\r\n" + 
				"  			<br>\r\n" + 
				"  			Email:<br>\r\n" + 
				"  			<input type=\"text\" name=\"email\" value=\"\">\r\n" + 
				"  			<br>\r\n" + 
				"  			Password:<br>\r\n" + 
				"  			<input type=\"text\" name=\"password\" value=\"\">\r\n" + 
				"  			<br><br>\r\n" + 
				"  			<input type=\"submit\" value=\"Register\">\r\n" + 
				"		</form> \r\n" + 
				"		\r\n" + 
				"		<br><br>\r\n" + 
				"		<a href=\"/Dynam_Hibernate_Prototype/login\"><button type=\"button\">Login</button> </a>\r\n" + 
				"	</body>\r\n" + 
				"</html>\r\n";
		
		return head;
	}
}