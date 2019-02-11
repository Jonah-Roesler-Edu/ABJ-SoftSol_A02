package iteration01;

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
				"		<form method=\"post\">\r\n" + 
				"			<fieldset>\r\n" + 
				"				<legend>Login:</legend>\r\n" + 
				"  				username:<br>\r\n" + 
				"  				<input type=\"text\" name=\"username\" value=\"\">\r\n" + 
				"  				<br>\r\n" + 
				"  				Password:<br>\r\n" + 
				"  				<input type=\"text\" name=\"password\" value=\"\">\r\n" + 
				"  				<br><br>\r\n" + 
				"  				<input type=\"submit\" value=\"Login\" name = \"submit\">\r\n" + 
				"  			</fieldset>\r\n" + 
				"		</form> \r\n" + 
				"		\r\n" + 
				"		<br><br>\r\n" + 
				"		<a href=\"\\Iteration01\\register\"><button type=\"button\">Register</button> </a>\r\n" + 
				"		<br><br>\r\n" + 
				"		<a href=\"ProfilePage.jsp\"><button type=\"button\">To Profile Page</button> </a>\r\n" + 
				"	</body>\r\n" + 
				"</html>\r\n";
		
		return head;
	}

}
