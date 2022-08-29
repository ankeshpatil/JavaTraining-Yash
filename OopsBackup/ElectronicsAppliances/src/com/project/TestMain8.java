package com.project;

import java.util.logging.Logger;

/*
 * author :Ankesh.Patil
 */
public class TestMain8 {
	/*
	 * Perform the following Inheritance map and print the details of each objects.
	 * Electornics class :- id, semiconductorType, dateOfManufacturing. Mobile, LCD
	 * and Laptop will inherit class electronics, you have to create object of
	 * Electronic class and instantiate with Mobile, LCD and Laptop class. And print
	 * the details accordingly.
	 */
	static Logger logger = Logger.getLogger(TestMain8.class.getName());

	public static void main(String[] args) {
		Electronics e1 = new Mobile(2321, "xyz", "12-3-2021");
		Electronics e2 = new LCD(453, "mnc", "7-04-2018");
		Electronics e3 = new Laptop(6329, "ABC", "21-08-2022");

		logger.info("Mobile :>> " + e1);
		logger.info("LCD info :>> " + e2);
		logger.info("Laptop info :>> " + e3);

	}

}
