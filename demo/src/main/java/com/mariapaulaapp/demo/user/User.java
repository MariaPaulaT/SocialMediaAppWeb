package com.mariapaulaapp.demo.user;

import java.time.LocalDate;

import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;
public class User {
	
 private Integer id;
 
 @Size(min=2, message = "Name should have at least two characters")
 private String name;
 
 @Past(message = "Birth date should not be in past")
 private LocalDate birthdate;
public User(Integer id, String name, LocalDate birthdate) {
	super();
	this.id = id;
	
	
	this.name = name;
	
	//@Past
	this.birthdate = birthdate;
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public LocalDate getBirthdate() {
	return birthdate;
}
public void setBirthdate(LocalDate birthdate) {
	this.birthdate = birthdate;
}
@Override
public String toString() {
	return "User [id=" + id + ", name=" + name + ", birthdate=" + birthdate + "]";
}
 
 
}
