package com.mariapaulaapp.demo.user;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;

@Entity(name="user_details")
public class User {

	@Id
	@GeneratedValue
 private Integer id;
 
 @Size(min=2, message = "Name should have at least two characters")
 @JsonProperty("user_name")
 private String name;
 
 @Past(message = "Birth date should not be in past")
 @JsonProperty("birth_date")
 private LocalDate birthdate;
 
 protected User() {
	 
 }
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
