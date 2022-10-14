package com.yash.jdbcmvc.jdbccrud.service;

public interface ProductService {

	public void save(int id, String Name, double price);

	public void delete(String Name);

	public void getProductList();

	public void updateProduct(int price, int Id);
}
