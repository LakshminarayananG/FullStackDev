package com.practice.javaConfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext atx = new AnnotationConfigApplicationContext(SpringConfig.class);
		Customer customer = atx.getBean("customer", Customer.class);
		customer.setName("Lakshmi");
		Account account = atx.getBean("account", Account.class);
		System.out.println(account);
		System.out.println(customer);
		atx.close();
	}

}
