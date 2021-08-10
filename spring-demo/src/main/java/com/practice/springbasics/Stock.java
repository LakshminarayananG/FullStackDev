package com.practice.springbasics;

public class Stock {

	private int availableStock;
	private int price;

	public Stock() {
		System.out.println("Stock default cons");
	}

	public Stock(int availableStock, int price) {
		System.out.println("Stock param cons");
		this.availableStock = availableStock;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Stock [availableStock=" + availableStock + ", price=" + price + "]";
	}

	public int getAvailableStock() {
		return availableStock;
	}

	public void setAvailableStock(int availableStock) {
		this.availableStock = availableStock;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
