package HTML_Pages;

public class HTML_Login {
	public static String writeHead() {
		String head = new String();
		head = "<!DOCTYPE html>\r\n" + 
				"<html>\r\n" + 
				"	<head>\r\n" + 
				"		<meta charset=\"utf-8\">\r\n" + 
				"		<title></title>\r\n" + 
				"	</head>\r\n" + 
				"	<body>\r\n" + 
				"		<h2>Login</h2>\r\n" + 
				"		\r\n" + 
				//"		<form method=\"post\" action=\"/Dynam_Hibernate_Prototype/profile\">\r\n" + 
				"		<form method=\"post\">\r\n" + 
				"			<fieldset>\r\n" + 
				"				<legend>Login:</legend>\r\n" + 
				"  				email:<br>\r\n" + 
				"  				<input type=\"text\" name=\"email\" value=\"\">\r\n" + 
				"  				<br>\r\n" + 
				"  				Password:<br>\r\n" + 
				"  				<input type=\"text\" name=\"password\" value=\"\">\r\n" + 
				"  				<br><br>\r\n" + 
				"  				<a href=\"/Dynam_Hibernate_Prototype/register\">" + 				
				"				<input type=\"submit\" value=\"Login\" name = \"submit\"></a>\r\n" + 
				"  			</fieldset>\r\n" + 
				"		</form> \r\n" + 
				"		\r\n" + 
				"		<br><br>\r\n" + 
				"		<a href=\"/Dynam_Hibernate_Prototype/register\"><button type=\"button\">Register</button> </a>\r\n" + 
//				"		<br><br>\r\n" + 
//				"		<a href=\"/Dynam_Hibernate_Prototype/profile\"><button type=\"button\">To Profile Page</button> </a>\r\n" + 
				"	</body>\r\n" + 
				"</html>\r\n";
		
		return head;
	}

}
