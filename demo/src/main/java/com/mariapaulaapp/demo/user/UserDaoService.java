package com.mariapaulaapp.demo.user;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {
	//JPA or Hibernate to talk to the database

	//UserDaoService > Static Lisst
	private static List<User> users = new ArrayList<>();
	static {
		users.add(new User(1, "Adam", LocalDate.now().minusYears(30)));
		users.add(new User(2, "Maria", LocalDate.now().minusYears(25)));
		users.add(new User(3, "Sergio", LocalDate.now().minusYears(25)));
	}
	
	public List<User> findAll(){
		return users;
	}
	//Have methods that allow to sabe user, find user, list all users
	
	
}
