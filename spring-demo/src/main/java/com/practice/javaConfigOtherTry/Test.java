package com.practice.javaConfigOtherTry;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AnnotationConfigApplicationContext atc = new AnnotationConfigApplicationContext(RootConfig.class);
		Stock stock = atc.getBean("stock", Stock.class);
		stock.setStockname("New Stocks");
		Inventory inventory = atc.getBean("inventory", Inventory.class);
		inventory.setId("7");
		Product product = atc.getBean("product", Product.class);
		System.out.println(stock);
		System.out.println(inventory);
		System.out.println(product);
		atc.close();

	}

}
