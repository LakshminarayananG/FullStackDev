package com.practice.demo3;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("demo3.xml");
		System.out.println(ctx.getBean("inventoryBean"));
		System.out.println(ctx.getBean("productBean"));
		System.out.println(ctx.containsBean("inventoryBean"));
		ctx.close();

	}
}
