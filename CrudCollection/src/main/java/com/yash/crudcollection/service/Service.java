package com.yash.crudcollection.service;
/**
 * @author ankesh.patil
 */
import java.util.List;

import com.yash.crudcollection.model.Product;

public interface Service {
	public List<Product> getDetails();

	public Product getDetailsById(int id);

	public Product save(Product data);

	public Product delete(int delete);

}
