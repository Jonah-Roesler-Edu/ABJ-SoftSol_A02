package com.JUnitTests.Entities;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import java.time.LocalDateTime;
import hibernatePack.Message;

class MessageTest {

	@Test
	void testMessageTxt() {
		Message message = new Message();
		message.setMessage("Hello");
		String test = message.getMessage();
		assertTrue(test.equals("Hello"));
	}
	
	@Test
	void testPosterEmail() {
		Message message = new Message();
		message.setPosterEmail("email");
		String test = message.getPosterEmail();
		assertTrue(test.equals("email"));
	}
	
	@Test
	void testDate() {
		Message message = new Message();
		LocalDateTime date = LocalDateTime.parse("2007-12-03T10:15:30");
		message.setDate(date);
		LocalDateTime test = message.getDate();
		assertTrue(test.equals(date));
	}

}
