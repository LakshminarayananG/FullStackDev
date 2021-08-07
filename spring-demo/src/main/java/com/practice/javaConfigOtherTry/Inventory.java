package com.practice.javaConfigOtherTry;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class Inventory {

	@Inject
	private String id;
	private Stock stock;

	public Inventory() {
		super();
	}

	public Inventory(String id) {
		super();
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Stock getStock() {
		return stock;
	}

	public void setStock(Stock stock) {
		this.stock = stock;
	}

	@Override
	public String toString() {
		return "Inventory [name=" + id + "]";
	}

}