package HTML_Pages;

import hibernatePack.Message;

public class HTML_Messages {
public static String writeHead() {	
		String messagePage = new String();
		messagePage = "<!DOCTYPE HTML>\r\n" + 
				"<html>\r\n" + 
				"    <head>\r\n" + 
				"    	<title>Messages</title>\r\n" + 
				"	 	<script type=\"text/javascript\" src=\"check.js\"></script>"+		
				"    </head>\r\n" + 
				"    <body>\r\n"+
				"	 	<p id=\'result\'></p>"+
				"	 	Welcome, " + 
				"	 	<div id=\"list\">"+
				"	 		<div id=\"content\">"+
				"			</div>	"+
				"		"	
				
		return messagePage;
	}
}
