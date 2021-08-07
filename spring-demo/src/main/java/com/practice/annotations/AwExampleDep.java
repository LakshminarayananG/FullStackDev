package com.practice.annotations;

import org.springframework.stereotype.Component;

@Component
public class AwExampleDep {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public AwExampleDep() {
		System.out.println("Dependent Class Constructor");
	}

}
