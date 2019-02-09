package iteration01;

public class HTML_Login {
	public static String writeHead() {
		String head = new String();
		head = "<!DOCTYPE html>"
				+ "<HTML>"
				+ "<head>"
				+ "<h1>Hello I am a called class, please login</h1>"
				+ "</head>"
				+ "<body>"
				+ "<p>Try inputting \"VIP\" and \"nonUser\"</p>"
				+ "<form METHOD = \"POST\">"
				+ "<INPUT TYPE = \"TEXT\" name = \"username\" >"
				+ "<INPUT TYPE = \"submit\" TEXT = \"login!\" name = \"submit\" >"
				+ "</form>"
				+ "<body>"
				+ "</HTML>";
		
		return head;
	}

}
