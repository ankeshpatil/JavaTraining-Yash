package com.yash.jdbcmvc.jdbccrud.main;

import java.util.Scanner;

import com.yash.jdbcmvc.jdbccrud.serviceImpl.ProductServiceImpl;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

/*
* author:ankesh.patil
* CRUD operation over product details using jdbc,mysql,java
*/
public class TestMain {



   static Scanner scanner = new Scanner(System.in);
    static Logger logger = Logger.getLogger(ProductServiceImpl.class.getClass());



   public static void main(String[] args) {
        BasicConfigurator.configure();
        ProductServiceImpl psi = new ProductServiceImpl();
        int z;
        do {
            logger.info("To proceed further Enter your choice" + "\n" + "Press '1' to insert new product " + "\n"
                    + "Press '2' to Delete product " + "\n" + "Press '3' to get product details" + "\n"
                    + "Press '4' to update the product price");



           z = scanner.nextInt();



           switch (z) {
            case 1:
                logger.info("Enter the number of product you want add in Table");
                int a = scanner.nextInt();
                for (int i = 0; i < a; i++) {
                    logger.info("Enter the id");
                    int id = scanner.nextInt();
                    logger.info("Enter the name");
                    String name = scanner.next();
                    logger.info("Enter the price");
                    double price = scanner.nextDouble();
                    psi.save(id, name, price);
                }
                break;
            case 2:
                logger.info("Enter the product name you want to delete from record");
                String s = scanner.next();
                psi.delete(s);
                logger.info("Product is deleted");
                break;
            case 3:
                logger.info("Product Retrived Data ");
                psi.getProductList();
                break;
            case 4:
                logger.info("Enter the product id whose price you want to update ");



               int id = scanner.nextInt();
                logger.info("Enter the new price ");
                int price = scanner.nextInt();
                psi.updateProduct(price, id);
                break;
            }
        } while (z != 5);
    }
}