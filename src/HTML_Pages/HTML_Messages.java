package HTML_Pages;

import hibernatePack.Message;

public class HTML_Messages {
public static String writeHead() {	
//		String messagePage = new String();
//		messagePage = "<!DOCTYPE HTML>\r\n" + 
//				"<html>\r\n" + 
//				"    <head>\r\n" + 
//				"    	<title>Messages</title>\r\n" + 
//				"	 	<script type=\"text/javascript\" src=\"check.js\"></script>"+		
//				"    </head>\r\n" + 
//				"    <body>\r\n"+
//				"	 	<p id=\'result\'></p>"+
//				"	 	Welcome, " + 
//				"	 	<div id=\"list\">"+
//				"	 		<div id=\"content\">"+
//				"			</div>	"+
//				"		"	
		
	StringBuilder ns = new StringBuilder();
	ns.append("<!DOCTYPE html>\r\n" + 
			"<html>\r\n" + 
			"	<head>\r\n" + 
			"		<meta charset=\"ISO-8859-1\">\r\n" + 
			"		<title>Messages</title>\r\n" + 
			"		<script type=\"text/javascript\" src=\"check.js\"></script>\r\n" + 
			"	</head>\r\n" + 
			"	<body>\r\n" + 
			"		<div>\r\n" + 
			"			<h1>Messages Chat:</h1>\r\n" + 
			"		</div>\r\n" + 
			"		\r\n" + 
			"		<div style=\"height:300px;width:50%;border:1px solid #ccc;overflow:auto;\">\r\n" + 
			"			<p id = \"result\"> \r\n" + 
			"				The quick brown fox jumps over the lazy dog The quick brown fox jumps over the lazy dog\r\n" + 
			"				The quick brown fox jumps over the lazy dog The quick brown fox jumps over the lazy dog\r\n" + 
			"				The quick brown fox jumps over the lazy dog The quick brown fox jumps over the lazy dog\r\n" + 
			"			</p>\r\n" + 
			"		</div>\r\n" + 
			"\r\n" + 
			"\r\n" + 
			"		<div id = \"list\">\r\n" + 
			"		<form method = \"post\">\r\n" + 
			"			<div id = \"content\">\r\n" + 
			"				<textarea id='h' style=\"width: 50%; height: 10%;\"></textarea>\r\n" + 
			"				<input style=\"display: none\" type=\"text\" id=\"u\" value=\"username\">\r\n" + 
			"				<input type=\"button\" value=\"send\" onclick=\"addText()\" />\r\n" + 
			"			</div>\r\n" + 
			"		</form>\r\n" + 
			"\r\n" + 
			"		</div>\r\n" + 
			"	</body>\r\n" + 
			"</html>");
	
				
		return ns.toString();
	}
}
