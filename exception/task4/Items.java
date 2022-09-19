package com.yash.exception.task4;

public class Items {
	String itemName;
	double price;
	int maximumNumberOfItem;

	Object[] itemList = { itemName, price, maximumNumberOfItem };

	public Items(String itemName, double price, int maximumNumberOfItem) {
		super();
		this.itemName = itemName;
		this.price = price;
		this.maximumNumberOfItem = maximumNumberOfItem;
	}

	@Override
	public String toString() {
		return "Item [itemName=" + itemName + ", price=" + price + ", maximumNumberOfItem=" + maximumNumberOfItem + "]";
	}

}
