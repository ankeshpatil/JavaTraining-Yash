package com.project;

import java.util.Scanner;
/*
 * author:ankesh patil
 */

public class TestMain6 {
	/*
	 * With the help of method overriding create two functions which will find the
	 * maximum of 3 and 4 numbers. Also write one generic function which can find
	 * maximum of N numbers.
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Find maximum of 3 ,4 or 5 for n number");

		int n = sc.nextInt();

		if (n == 3) {

			System.out.println("Enter 3 digit number");

			int number = sc.nextInt();

			Class2 class2 = new Class2();

			class2.getNumbers(number);
		}

		if (n == 4) {

			System.out.println("Enter 4 digit number");

			int number = sc.nextInt();

			Class3 class3 = new Class3();

			class3.getNumbers(number);
		}

		if (n == 5) {

			System.out.println("Enter n digit number");

			int number = sc.nextInt();

			Class4 class4 = new Class4();

			class4.getNumbers(number);
		}

	}

}
