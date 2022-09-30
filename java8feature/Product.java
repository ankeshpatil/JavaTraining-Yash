package com.yash.java8feature;

public class Product {
	int id;
	String name;
	int price;
	public int getPrice() {
		return this.price;
	}
	

	public Product(int id, String name, int price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}

}
