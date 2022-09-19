package com.yash.collection.task2;

import java.util.ArrayList;
import java.util.Collections;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

/**
 * 
 * @author ankesh.patil
 *
 */
/*
 * WAP to store all Collection elements in Array and perform the Binary Search
 */
public class TestMain2 {
	static Logger logger = Logger.getLogger(TestMain2.class.getName());

	public static void main(String[] args) {
		BasicConfigurator.configure();
		ArrayList<Integer> arr = new ArrayList<Integer>();

		arr.add(5);
		arr.add(10);
		arr.add(15);
		arr.add(20);
		arr.add(25);
		arr.add(30);
		arr.add(35);
		
		int value=15;
		int result=Collections.binarySearch(arr, 20);
		logger.info("Value at index  :"+result);
	}

}
