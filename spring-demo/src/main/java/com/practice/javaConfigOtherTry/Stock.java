package com.practice.javaConfigOtherTry;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class Stock {

	@Inject
	private String stock;

	public Stock() {
		System.out.println("Stock Constructor");
	}

	public Stock(String stockname) {
		super();
		this.stock = stockname;
	}

	public String getStockname() {
		return stock;
	}

	public void setStockname(String stockname) {
		this.stock = stockname;
	}

}
