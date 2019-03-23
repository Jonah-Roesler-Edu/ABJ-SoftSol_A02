package hibernatePack;

import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="message")
public class Message {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	long id;
	@Column(nullable = false)
	
	public String messageText;
	public LocalDateTime date;
	public String posterEmail;
	
	public long getId() {
		return id;
	}
	public String getMessage() {
		return messageText;
	}
	public void setMessage(String _Message) {
		messageText = _Message;
	}
	public LocalDateTime getDate() {
		return date;
	}
	public void setDate(LocalDateTime _Date) {
		date = _Date;
	}
	public String getPosterEmail() {
		return posterEmail;
	}
	public void setPosterEmail(String _PosterEmail) {
		posterEmail = _PosterEmail;
	}
	
	@Override
	public String toString() {
	StringBuilder newString = new StringBuilder();
	newString.append("-----------");
	newString.append(posterEmail + " - " + messageText);
	newString.append(date);
	return newString.toString();
	}
	
}
