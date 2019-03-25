package hibernatePack;

import java.time.LocalDateTime;
import java.util.List;

public class MessageUtility {
	public static void createMessage(String messageText,String posterEmail) {
		Message newMessage = new Message();
		newMessage.setMessage(messageText);
		newMessage.setPosterEmail(posterEmail);
		LocalDateTime date = LocalDateTime.now();
		newMessage.setDate(date);
		
		MessageDBManager newDB = new MessageDBManager();
		newDB.createMessage(newMessage);
	}
	
	public static List getMessages() {
		MessageDBManager messageDB = new MessageDBManager();
		return messageDB.listMessages();
	}
}
