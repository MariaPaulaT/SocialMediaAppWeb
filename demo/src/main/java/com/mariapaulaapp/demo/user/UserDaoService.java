package com.mariapaulaapp.demo.user;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Component;
//User bean and User Dao Service
@Component
public class UserDaoService {
	
	//JPA or Hibernate to talk to the database

	//UserDaoService > Static Lisst
	private static List<User> users = new ArrayList<>();
	private static int userCount = 0;
	static {
		users.add(new User(userCount++, "Adam", LocalDate.now().minusYears(30)));
		users.add(new User(userCount++, "Maria", LocalDate.now().minusYears(25)));
		users.add(new User(userCount++, "Sergio", LocalDate.now().minusYears(25)));
	}
	//Have methods that allow to sabe user, find user, list all users
	
	public List<User> findAll(){
		return users;
	}
	
	
	public User findOne(Integer id) {
		// TODO Auto-generated method stub
		Predicate<? super User> Predicate = user -> user.getId()==id;
		//if it dosnt find the user it returns something else
		return users.stream().filter(Predicate).findFirst().orElse(null);
	}


	public User save(User user) {
		// TODO Auto-generated method stub
		user.setId(userCount++);
		users.add(user);
		return user;
		
	}

	
}
