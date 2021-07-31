package com.practice.demo3;

public class Inventory {

	private String id;
	private String name;
	private Stock stock;
	
	public Stock getStock() {
		return stock;
	}

	public void setStock(Stock stock) {
		this.stock = stock;
	}

	public Inventory() {
		System.out.println("Inventory Constructor");
	}

	@Override
	public String toString() {
		return "Inventory [id=" + id + ", name=" + name + ", stock=" + stock + "]";
	}

	public Inventory(String id, String name, Stock stock) {
		super();
		this.id = id;
		this.name = name;
		this.stock = stock;
	}

}