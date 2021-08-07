package com.practice.javaConfigOtherTry;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class Product {

	@Inject
	private Inventory inventory;

	public Inventory getInventory() {
		return inventory;
	}

	public void setInventory(Inventory inventory) {
		this.inventory = inventory;
	}

	public Product() {
		System.out.println("Product Cons");
	}

	public Product(Inventory inventory) {
		System.out.println("Product Param Cons");
		this.inventory = inventory;
	}

	@Override
	public String toString() {
		return "Product [inventory=" + inventory + "]";
	}

}