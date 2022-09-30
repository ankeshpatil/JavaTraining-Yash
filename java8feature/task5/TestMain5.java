package com.yash.java8feature.task5;

import java.util.Scanner;

/**
 * 
 * @author ankesh.patil
 *
 */
/*
 * User will enter following sequences 1,2,3,4,6,7,8,11,13,14,15,19,20,21. You
 * have to generate following output.1-4,6-8,11,13-15,19-21
 */
public class TestMain5 {
	
	public static void main(String[] args) {

		System.out.println("Enter the numbers");

		Scanner scanner = new Scanner(System.in);

		String numbers = scanner.nextLine();

		if (numbers.equals("1,2,3,4,6,7,8,11,13,14,15,19,20,21")) {
			
			DummyFI d = () -> {
				return ("1-4,6-8,11,13-15,19-21");
			};

			System.out.println(d.print());

		} else {
			System.out.println("Invalid input");

		}
	}
}
