package com.practice.constructorInjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("constructor.xml");
		System.out.println(ctx.getBean("product", Product.class));
		ctx.close();

	}

}
