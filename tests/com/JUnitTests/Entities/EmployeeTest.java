package com.JUnitTests.Entities;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import hibernatePack.Employee;

class EmployeeTest {

	@Test
	void testEmail() {
		Employee Employee = new Employee();
		Employee.setEmail("TestEmail");
		String test = Employee.getEmail();
		
		assertTrue(test.equals("TestEmail"));
		
		//System.out.println("Works for Email");
	}
	@Test
	void testFirstName() {
		Employee Employee = new Employee();
		Employee.setFName("TestFirstName");
		String test = Employee.getFName();
		
		assertTrue(test.equals("TestFirstName"));
		
		//System.out.println("Works for First Name");
	}
	@Test
	void testLastName() {
		Employee Employee = new Employee();
		Employee.setLName("TestFirstName");
		String test = Employee.getLName();
		
		assertTrue(test.equals("TestFirstName"));
		
		//System.out.println("Works for Last Name");
	}
	@Test
	void testPassword() {
		Employee Employee = new Employee();
		Employee.setPass("TestPassword");
		String test = Employee.getPass();
		
		assertTrue(test.equals("TestPassword"));
		
		//System.out.println("Works for Password");
	}
	@Test
	void testPhone() {
		Employee Employee = new Employee();
		Employee.setPhone("TestPhone");
		String test = Employee.getPhone();
		
		assertTrue(test.equals("TestPhone"));
		
		//System.out.println("Works for Phone");
	}
	@Test
	void testAddress() {
		Employee Employee = new Employee();
		Employee.setAddress("TestAddress");
		String test = Employee.getAddress();
		
		assertTrue(test.equals("TestAddress"));
		
		//System.out.println("Works for Address");
	}

}
