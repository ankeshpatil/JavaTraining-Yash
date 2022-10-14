package com.yash.pms.controller;

/**
 * @author ankesh.patil
 */
import java.util.List;
import java.util.Optional;

import com.yash.pms.customexception.InvalidProduct;
import com.yash.pms.model.Product;
import com.yash.pms.serviceImpl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

	@Autowired
	ServiceImpl serviceImpl;
	Product product;

	@GetMapping("/getallproduct")
	public List<Product> getProduct() {
		return serviceImpl.getAllProduct();
	}

	@GetMapping("/getById/{productId}")
	public 	ResponseEntity <Product> getById(@PathVariable int productId) {
		
		Product pr=serviceImpl.getProductsById(productId);
		if(pr==null) {
			 System.out.println(HttpStatus.NOT_FOUND);
	            // return  ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
	             return  ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		else
		return ResponseEntity.of(Optional.of(pr));
	}


	
	@PostMapping("/saveproduct")
	public void saveProduct(@RequestBody Product product) {

		serviceImpl.saveProduct(product);
	}

	@PutMapping("/update")
	public String update(@RequestBody Product product) throws InvalidProduct {
		return serviceImpl.update(product);
	}
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable int id) {
		serviceImpl.delete(id);
	}

}
