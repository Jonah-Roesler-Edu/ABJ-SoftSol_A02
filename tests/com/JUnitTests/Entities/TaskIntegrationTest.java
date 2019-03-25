package com.JUnitTests.Entities;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import hibernatePack.EmpUtility;
import hibernatePack.Employee;
import hibernatePack.Task;
import hibernatePack.TaskUtility;

class TaskIntegrationTest {

	@Test
	void testCRUD() { // change the task number up 1 every time you run this
		//create
		TaskUtility.createTask("creatorEmail", "workerEmail", "2007-12-03T10:15:30", "txtTask");
		System.out.println("Created");
		
		//read
		Task taskRead = TaskUtility.getTask(1);
		System.out.println(taskRead.toString());
		
		//update
		TaskUtility.updateTaskStatus(1);
		System.out.println(taskRead.toString());
		
		//delete
		TaskUtility.deleteTaskStatus(1);
		System.out.println("Deleted");
	}
	/*@Test
	void testCreate() {
		TaskUtility.createTask("creatorEmail", "workerEmail", "2007-12-03T10:15:30", "txtTask");
		System.out.println("Created");
	}
	@Test
	void testRead() {
		Task taskRead = TaskUtility.getTask(2);
		System.out.println(taskRead.toString());
	}
	@Test
	void testUpdate() {
		Task taskRead = TaskUtility.getTask(2);
		TaskUtility.updateTaskStatus(2);
		System.out.println(taskRead.toString());
	}
	@Test
	void testDelete() {
		TaskUtility.deleteTaskStatus(2);
		System.out.println("Deleted");
	}*/
}
