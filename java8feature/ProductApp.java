package com.yash.java8feature;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProductApp {
	
	public static void main(String[] args) {
		ArrayList<Product> al=new ArrayList<Product>();
		al.add(new Product(12, "sugar", 130));
		al.add(new Product(13, "jaggery", 160));
		al.add(new Product(14, "Soap", 100));
		al.add(new Product(15, "Aata", 90));
		
		//System.out.println(al);
		
		
		ArrayList<Product> al1=(ArrayList<Product>) al.stream()
				.filter(p->p.getPrice()<=150).collect(Collectors.toList());
		System.out.println(al1);
		
		/*
		 * for(Product p: al) { if(p.getPrice()<=150) {
		 * 
		 * System.out.println("product list less than 150>>>>>>>>>>"+p);
		 * 
		 * 
		 * } }
		 */
		
		
		
		/*
		 * List<Product>
		 * l=al.stream().filter(p->p.getPrice()<=150).collect(Collectors.toList());
		 * System.out.println(l);
		 */
	}

}
