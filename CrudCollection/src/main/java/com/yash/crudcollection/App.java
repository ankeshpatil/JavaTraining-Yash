package com.yash.crudcollection;

import java.util.Scanner;

import com.yash.crudcollection.model.Product;
import com.yash.crudcollection.serviceImpl.ServiceImpl;

/**
 * @author ankesh.patil
 */
public class App {
	public static void main(String[] args) {
		int j;
		ServiceImpl si = new ServiceImpl();
		Scanner scr = new Scanner(System.in);
		do {
			System.out.println("Enter 1 for all Details");
			System.out.println("Enter 2 for get details by id");
			System.out.println("Enter 3 for saving product into list");
			j = scr.nextInt();

			switch (j) {
				case 1:
					Product pm=(Product) si.getDetails();
					System.out.println(pm.getName()+" "+pm.getId()+" "+pm.getPrice());
					
					break;
				case 2:
					System.out.println("Enter the id to get details by id");
					int i = scr.nextInt();
					si.getDetailsById(i);
					break;
				case 3:
					System.out.println("Enter the integer u want to add");
					int l = scr.nextInt();
					System.out.println("Enter the pname u want to add");
					String m = scr.next();
					System.out.println("Enter the price u wnat to add");
					double n = scr.nextDouble();
					Product p = new Product(l, m, n);
					si.save(p);
					break;
			}
		} while (j != 5);
	}

}
