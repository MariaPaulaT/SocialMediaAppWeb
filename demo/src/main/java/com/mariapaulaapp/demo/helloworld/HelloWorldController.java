package com.mariapaulaapp.demo.helloworld;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//Expose REST API
//Mark controller as a rest controller
@RestController
public class HelloWorldController {

	// hello-word
	//return "Hello World""
	//we want to map this into a request method
	//We want to map this method to a GET request
	@RequestMapping(path = "/hello-world")
	public String helloWorld() {
		return "Hello World!";
	}
	
	@RequestMapping(path = "/hello-world-bean")
	public HelloWorldBean helloWorldBean() {
		return new HelloWorldBean ("Hello World!");
	}
	
	//Path parameters
	//users/{id}/todos/{id}
	@RequestMapping(path = "/hello-world-bean/path-variable/{name}")
	public HelloWorldBean helloWorldBeanPathVariable(@PathVariable String name) {
		return new HelloWorldBean (String.format("Hello World!, %s", name));
	}
	
}
