package com.practice.demo2;

public class Inventory {

	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Inventory() {
		System.out.println("Inventory Cons");
	}

	public Inventory(String id) {
		System.out.println("Inventory Param Cons");
		this.id = id;
	}

	

	@Override
	public String toString() {
		return "Inventory [name=" + id + "]";
	}

}