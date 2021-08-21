package com.practice.springbasics;

public class Account {

	private Customer customer;

	public Account(Customer customer) {
		System.out.println("Account Param Cons");
		this.customer = customer;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Account() {
		System.out.println("This is default constructor from Account class");
	}

}
