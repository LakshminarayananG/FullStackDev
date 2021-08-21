package com.practice.springbasics;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("./springbasics.xml");

		Customer customer = context.getBean("customerBean", Customer.class);
		customer.setName("Laks");
		System.out.println(customer);
		Account account = context.getBean("accountBean", Account.class);
		System.out.println(account);

		Account account1 = context.getBean("accountBean1", Account.class);
		System.out.println(account1);

		ClassPathXmlApplicationContext context1 = new ClassPathXmlApplicationContext("./springbasics2.xml");

		Product prod = context1.getBean("productBean", Product.class);
		System.out.println(prod);

		Product prod1 = context1.getBean("productBean1", Product.class);
		System.out.println(prod1);

		Inventory inv = context1.getBean("inventoryBean", Inventory.class);
		System.out.println(inv);

		context.close();
		context1.close();
	}
}
