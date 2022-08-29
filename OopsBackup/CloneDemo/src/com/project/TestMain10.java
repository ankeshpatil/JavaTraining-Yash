package com.project;

/*
 * author:Ankesh
 */
public class TestMain10 {
	/*
	 * 10)WAP to demonstrate the use of clone method. Clone one object of Product
	 * class :- pid, pname, price and unitOfMeasurement. When you clone object of
	 * class Product change the product name and price. With the help of instanceOf
	 * check that the newly created object is belong to Product class or not.
	 */
	public static void main(String[] args) throws CloneNotSupportedException {

		Product Product1 = new Product(10, "Rahul", 1000, "Meter");

		Product Product2 = (Product) Product1.clone();

		System.out.println(Product2);

		System.out.println(Product2 instanceof Product);

	}

}
