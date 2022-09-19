package com.yash.collection.task5;

import java.util.Collections;
import java.util.Vector;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

/**
 * 
 * @author ankesh.patil
 *
 */
/*
 * WAP to store data related to item in Vector and after that sort the data.
 */
public class TestMain5 {
	static Logger logger = Logger.getLogger(TestMain5.class.getName());

	public static void main(String[] args) {
		BasicConfigurator.configure();

		Vector<Items> v = new Vector<Items>();
		v.add(new Items(101, "pepsi", 90));
		v.add(new Items(105, "coke", 65));
		v.add(new Items(103, "Fanta", 80));
		v.add(new Items(102, "Redbull", 100));
		v.add(new Items(104, "Fruity", 30));

		Collections.sort(v, new IdComparator());

		for (Items i : v)

			logger.info("Items Id: " + i.getItemId() + "  Items NAME:  " + i.getName() + "  Item price:  " + i.getPrice());

	}

}
