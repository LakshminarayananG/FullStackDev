package com.practice.springbasics;

public class Inventory extends Stock {

	private String stockId;

	public Inventory(String prodName) {
		this.stockId = prodName;
	}

	@Override
	public String toString() {
		return "Inventory [prodName=" + stockId + "]";
	}

	public String getProdName() {
		return stockId;
	}

	public void setProdName(String prodName) {
		this.stockId = prodName;
	}

	public Inventory() {
		System.out.println("Inventory Default Cons");
	}

	public Inventory(int availableStock, int price, String stockId) {
		super(availableStock, price);
		this.stockId = stockId;
		// TODO Auto-generated constructor stub
	}

}
