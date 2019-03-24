package HTML_Pages;

import hibernatePack.Message;

public class HTML_Messages {
public static String writeHead(String email) {	
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
			"		<script > function addText()\r\n" + 
			"{\r\n" + 
			"    var username = " + email + ";" +  
			"    var msg = document.getElementById('h').value;\r\n" + 
			"    olist = document.getElementById('list');\r\n" + 
			"    op = document.createElement('p');\r\n" + 
			"    op.innerHTML = username + \" - <g>\" + msg + \"</g>\";\r\n" + 
			"    ocontent = document.getElementById('content');\r\n" + 
			"    ocontent.appendChild(op);             //Add new line on click\r\n" + 
			"    olist.scrollTop = olist.scrollHeight; //Adjust Height\r\n" + 
			"    document.getElementById('h').value = '';\r\n" + 
			"    var xmlhttp;\r\n" + 
			"    if (window.XMLHttpRequest)\r\n" + 
			"    {// code for IE7+, Firefox, Chrome, Opera, Safari\r\n" + 
			"        xmlhttp = new XMLHttpRequest();\r\n" + 
			"    }\r\n" + 
			"    else\r\n" + 
			"    {// code for IE6, IE5\r\n" + 
			"        xmlhttp = new ActiveXObject(\"Microsoft.XMLHTTP\");\r\n" + 
			"    }\r\n" + 
			"\r\n" + 
			"    xmlhttp.open(\"POST\", \"chatstore?uname=\" + username + \"&msg=\" + msg, true);\r\n" + 
			"\r\n" + 
			"    xmlhttp.onreadystatechange = function()\r\n" + 
			"    {\r\n" + 
			"        if (xmlhttp.readyState == 4 && xmlhttp.status == 200)\r\n" + 
			"        {\r\n" + 
			"            document.getElementById(\"result\").innerHTML = 'sent';\r\n" + 
			"            document.getElementById(\"result\").innerHTML = '';\r\n" + 
			"        }\r\n" + 
			"    }\r\n" + 
			"    xmlhttp.send(null);\r\n" + 
			"}</script>\r\n" + 
			"	</head>\r\n" + 
			"	<body>\r\n" + 
			"		<div>\r\n" + 
			"			<h1>Messages Chat:</h1>\r\n" + 
			"			<h2>Welcome, " + email + "</h2>\r\n" + 
			"		</div>\r\n" +  
			//"		<div style=\"height:300px;width:50%;border:1px solid #ccc;overflow:auto;\">\r\n" + 
			//"			<p id = \"result\"> \r\n" +   
			//"			</p>\r\n" + 
			//"		</div>\r\n" + 
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
