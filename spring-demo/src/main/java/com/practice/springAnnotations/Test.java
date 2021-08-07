package com.practice.springAnnotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("annotations.xml");
		Customer customer = ctx.getBean("customer", Customer.class);
		customer.setName("Test");
		System.out.println(customer);

	}
}
