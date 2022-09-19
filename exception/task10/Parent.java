package com.yash.exception.task10;

import java.util.Arrays;

public class Parent {
	
	TestMain10 m1 = new TestMain10();

	void largest(int[] arr) {
		try {
			System.out.println("I am from Parent class");
			Arrays.sort(arr);

		} catch (ArrayIndexOutOfBoundsException | NullPointerException e) {
			System.out.println(e);
		}

	}
}
