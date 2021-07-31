package com.practice.demo3;

public class Stock {

	private String name;

	public Stock() {
		System.out.println("Stock Classes");
	}

	@Override
	public String toString() {
		return "Stock [name=" + name + "]";
	}

	public Stock(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}