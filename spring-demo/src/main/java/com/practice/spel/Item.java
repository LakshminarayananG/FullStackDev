package com.practice.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("itemBean")
//Will create a bean
//Item itemBean = new Item()
public class Item {

	@Value("itemA")
	// String name="itemA
	private String name;

	@Value("10")
	// int qry=10;
	private int qty;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	@Override
	public String toString() {
		return "Item [name=" + name + ", qty=" + qty + "]";
	}

}
