package com.yash.collection.task5;

public class Items {

	private int itemId;
	private String name;
	private int price;

	@Override
	public String toString() {
		return "Items [itemId=" + itemId + ", name=" + name + ", price=" + price + "]";
	}

	public Items(int itemId, String name, int price) {
		super();
		this.itemId = itemId;
		this.name = name;
		this.price = price;
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
