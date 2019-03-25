package com.JUnitTests.Entities;

import static org.junit.jupiter.api.Assertions.*;

import java.io.PrintWriter;

import javax.servlet.http.HttpSession;

import org.junit.jupiter.api.Test;

import hibernatePack.EmpUtility;
import hibernatePack.Employee;

class EmpIntegrationTest {

	/*@Test
	void testCreate() {
		EmpUtility.writeProfile("email", "firstname", "lastname",
				"password", "address", "phone");
	}
	@Test
	void testRead() {
		Employee profileEmployee = EmpUtility.getProfile("email");
		
		System.out.println(profileEmployee.toString());
	}
	@Test
	void testDelete() {
		EmpUtility.deleteProfile("email", "password");
		
		System.out.println("Deleted");
	}*/
	@Test
	void testCRUD() {
		//create
		EmpUtility.writeProfile("email", "firstname", "lastname",
				"password", "address", "phone");
		System.out.println("Created");
		
		//read
		Employee profileEmployee = EmpUtility.getProfile("email");
		System.out.println(profileEmployee.toString());
		
		//update
		
		
		//delete
		EmpUtility.deleteProfile("email", "password");
		System.out.println("Deleted");
	}
}
