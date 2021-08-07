package com.practice.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("customerBean")
//Customer customerBean = new Customer();
public class Customer {

	private Item item;

	@Value("#{itemBean.name}")
	// String itemName=new Item().name
	// String itemName=itemA
	private String itemName;

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	@Override
	public String toString() {
		return "Customer [item=" + item + ", itemName=" + itemName + "]";
	}

}
