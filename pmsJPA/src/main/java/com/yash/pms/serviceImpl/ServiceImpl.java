package com.yash.pms.serviceImpl;

import java.util.List;

import com.yash.pms.customexception.InvalidProduct;
import com.yash.pms.model.Product;
import com.yash.pms.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceImpl {
	@Autowired
	ProductRepository productRepository;
	@Autowired
	ServiceImpl serviceImpl;
	

	public List<Product> getAllProduct() {
		return productRepository.findAll();
	}

	public void saveProduct(Product product) {

		productRepository.save(product);
	}

	public void delete(int id) {
		productRepository.deleteById(id);
	}

	public String update(Product product) throws InvalidProduct {
		
		Product product1=productRepository.findById(product.getId()).orElse(null);
		if(product1==null) {
			throw new InvalidProduct("No such product exist");
		}else {
			product1.setName(product.getName());
			product1.setPrice(product.getPrice());
		}
		 productRepository.save(product1);
		 
		 return "Record Updated";
	}

	public Product getProductsById(int Id) {
		return productRepository.findById(Id).orElse(null);
	}

}
