package com.yash.jdbcmvc.jdbccrud.model;

public class Product {

	int Id;
	String name;
	double price;

	public Product(int id, String name, double price) {
		super();
		Id = id;
		this.name = name;
		this.price = price;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
