package com.mariapaulaapp.demo.user;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class UserNotFoundException extends RuntimeException {
//It should be a 404 response because the user is not found

	public UserNotFoundException(String message) {
		// TODO Auto-generated constructor stub
		super(message);
	}
}
