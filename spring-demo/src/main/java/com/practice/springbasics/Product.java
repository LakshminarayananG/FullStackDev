package com.practice.springbasics;

public class Product {

	private Stock inventory;
	private String productName;

	public Product() {
		System.out.println("Default cons");
	}

	@Override
	public String toString() {
		return "Product [inventory=" + inventory + ", productName=" + productName + "]";
	}

	public Product(Stock inventory, String productName) {
		this.inventory = inventory;
		this.productName = productName;
	}

	public Stock getInventory() {
		return inventory;
	}

	public void setInventory(Stock inventory) {
		this.inventory = inventory;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

}
