package com.practice.springbasics;

public class Customer {

	private String name;

	public Customer() {
		System.out.println("Customer cons");
	}

	public Customer(String name) {
		System.out.println("Name cons");
		this.name = name;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
