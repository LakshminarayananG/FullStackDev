package com.practice.constructorInjection;

public class Product {

	private String name;
	private String category;
	private int id;

	public Product() {
	}

	public Product(String name, String category, int id) {
		System.out.println("Name is: " + name + " Category is: " + category + " Id is: " + id);
		this.name = name;
		this.category = category;
		this.id = id;
	}

	public Product(String name, int id, String category) {
		System.out.println("Name is " + name + " Id is: " + id + " Category is: " + category);
		this.name = name;
		this.id = id;
		this.category = category;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", category=" + category + ", id=" + id + "]";
	}

}
