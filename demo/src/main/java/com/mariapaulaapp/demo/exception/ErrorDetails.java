package com.mariapaulaapp.demo.exception;

import java.time.LocalDateTime;

public class ErrorDetails {
//I want a timestamp of when the error happened, a message and details of the error.
	private LocalDateTime timestamp;
	private String message;
	private String details;

	

	public ErrorDetails(LocalDateTime now, String message2, String description) {
		// TODO Auto-generated constructor stub
		super();
		this.timestamp = timestamp;
		this.message = message;
		this.details = details;
	}

	public LocalDateTime getTimestamp() {
		return timestamp;
	}

	public String getMessage() {
		return message;
	}

	public String getDetails() {
		return details;
	}
	
	
	
	
	
}
