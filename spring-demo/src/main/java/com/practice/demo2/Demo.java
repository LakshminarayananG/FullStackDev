package com.practice.demo2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

	
	public static void main(String[] args) {

		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("demo2.xml");
		ctx.close();
	}
}
