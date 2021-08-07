package com.practice.javaConfig;

import org.springframework.stereotype.Component;

@Component
public class Customer {

	private String name;

	public Customer() {
		System.out.println("Customer Cons");
	}

	public Customer(String name) {
		System.out.println("Customer Param Cons");
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + "]";
	}

}