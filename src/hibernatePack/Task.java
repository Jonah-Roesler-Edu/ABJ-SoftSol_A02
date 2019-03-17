package hibernatePack;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="task")
public class Task {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	long id;
	@Column(nullable = false)
	
	public String taskText;
	public String creatorEmail;
	public String workerEmail;
	public String dateDue;
	public Date dateAssign;
	
	
	public String getCreator() {
		return creatorEmail;
	}
	public void setCreatorEmail(String _Email) {
		creatorEmail = _Email;
	}

	public String getWorker() {
		return workerEmail;
	}
	public void setWorkerEmail(String _Email) {
		workerEmail = _Email;
	}
	
	public String getTaskText() {
		return taskText;
	}
	public void setTaskText(String _task) {
		taskText = _task;
	}
	
	public String getDateDue() {
		return dateDue;
	}
	public void setDateDue(String _Date) {
		dateDue = _Date;
	}
	
	public Date getDateAssign() {
		return dateAssign;
	}
	public void setDateAssign(Date _Date) {
		dateAssign = _Date;
	}
	
	@Override
	public String toString() {
	StringBuilder newString = new StringBuilder();
	newString.append("-----------");
	newString.append("creator: " + creatorEmail + " || ");
	newString.append("Assign to: " + workerEmail + " || ");
	newString.append("Assign date: " + dateAssign + " || ");
	newString.append("Due Date: " + dateDue);
	newString.append("-----------");
	return newString.toString();
	}

}