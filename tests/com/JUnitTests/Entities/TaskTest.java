package com.JUnitTests.Entities;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;

import hibernatePack.Task;

class TaskTest {

	@Test
	void testCreatorEmail() {
		Task task = new Task();
		task.setCreatorEmail("TestCreatorEmail");
		String test = task.getCreator();
		
		assertTrue(test.equals("TestCreatorEmail"));
		
		//System.out.println("Works for Creator Email");
	}
	@Test
	void testWorkerEmail() {
		Task task = new Task();
		task.setWorkerEmail("TestWorkerEmail");
		String test = task.getWorker();
		
		assertTrue(test.equals("TestWorkerEmail"));
		
		//System.out.println("Works for Worker Email");
	}
	@Test
	void testTaskText() {
		Task task = new Task();
		task.setTaskText("TestTaskText");
		String test = task.getTaskText();
		
		assertTrue(test.equals("TestTaskText"));
		
		//System.out.println("Works for Task Text");
	}
	@Test
	void testAssignDate() {
		Task task = new Task();
		LocalDateTime date = LocalDateTime.parse("2007-12-03T10:15:30");
		task.setDateAssign(date);
		LocalDateTime test = task.getDateAssign();
		
		assertTrue(test.equals(date));
		
		//System.out.println("Works for Assign Date");
	}
	@Test
	void testDueDate() {
		Task task = new Task();
		
		LocalDateTime date = LocalDateTime.parse("2007-12-03T10:15:30");
		task.setDateDue(date);
		LocalDateTime test = task.getDateDue();
		
		assertTrue(test.equals(date));
		
		//System.out.println("Works for Due Date");
	}
	@Test
	void testStatus() {
		Task task = new Task();
		task.setStatus("TestStatus");
		String test = task.getStatus();
		
		assertTrue(test.equals("TestStatus"));
		
		//System.out.println("Works for Status");
	}

}
