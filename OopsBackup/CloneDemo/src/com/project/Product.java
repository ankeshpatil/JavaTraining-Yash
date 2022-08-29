package com.project;

/*
 * Author:ankesh.patil
 */
public class Product {
	/*
	 * 10)WAP to demonstrate the use of clone method. Clone one object of Product class
	 * :- pid, pname, price and unitOfMeasurement. When you clone object of class
	 * Product change the product name and price. With the help of instanceOf check
	 * that the newly created object is belong to Product class or not.
	 */
	private int pid;
	private String pname;
	private int price;
	private String unitOfMeasurement;

	public Product(int pid, String pname, int price, String unitOfMeasurement) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.price = price;
		this.unitOfMeasurement = unitOfMeasurement;
	}


	public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", price=" + price + ", unitOfMeasurement="
				+ unitOfMeasurement + "]";
	}

}
