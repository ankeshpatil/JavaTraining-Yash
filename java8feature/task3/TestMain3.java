package com.yash.java8feature.task3;

import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * 
 * @author ankesh.patil
 *
 */
/*
 * User will be asked to enter two integer like 1 34 or 2 44 or 3 151 or 4 454.
 * 1 to check given no is even, 2 for odd number, 3 for Armstrong number, 4 for
 * palindrome number.
 */
public class TestMain3 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the first Number");

		int number1 = scanner.nextInt();

		System.out.println("Enter the second Number");

		int number2 = scanner.nextInt();

		System.out.println("Enter the Third Number");

		int number3 = scanner.nextInt();

		System.out.println("Enter the Fourth Number");

		int number4 = scanner.nextInt();

		boolean biconsumer1 = number1 % 2 == 0;

		if (biconsumer1 == true) {
			System.out.println("The number is even");

		} else {
			System.out.println("The number is Odd");

		}

		boolean biconsumer2 = number2 % 2 != 0;

		if (biconsumer2 == true) {
			System.out.println("The number is Odd");

		} else {
			System.out.println("The number is Even");

		}

		int remainder = 0;
		int rev = 0;

		int reduce = IntStream.iterate(number3, i -> i / 10).map(n -> n % 10).limit(String.valueOf(number3).length())
				.reduce(0, (a, b) -> a = a + (b * b * b));

		if (reduce == number3) {
			System.out.println("The number is ArmStrong");

		} else {

			System.out.println("The number is Not-ArmStrong");

		}

		int reverse = IntStream.iterate(number4, i -> i / 10).map(n -> n % 10).limit(String.valueOf(number4).length())
				.reduce(0, (a, b) -> a = a * 10 + b);

		if (reverse == number4) {
			System.out.println("The number is Palindrome");

		} else {

			System.out.println("The number is Not-Palindrome");

		}

	}

}
