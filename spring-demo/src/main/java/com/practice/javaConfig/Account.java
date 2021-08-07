package com.practice.javaConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Account {

	@Autowired
	private Customer customer;

	public Account() {
		System.out.println("Acccount Cons");
	}

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

	@Override
	public String toString() {
		return "Account [customer=" + customer + "]";
	}

}