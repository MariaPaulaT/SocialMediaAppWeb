package com.mariapaulaapp.demo.versioning;

public class PersonV1 {

	private String name;

	

	public PersonV1(String name2) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "PersonV1 [name=" + name + "]";
	}
}
