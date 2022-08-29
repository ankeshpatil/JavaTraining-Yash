package com.project;

import java.util.Scanner;

/*
 * author:Ankesh.patil
 */
public class TestMain7 extends StringCom {
	/*
	 * With the help of method overriding perform the string comparison. User will
	 * input two string and your task is to compare both the string one alphabets at
	 * a time.
	 */

	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter first String");

		String str1 = scanner.nextLine();

		System.out.println("Enter Second String");

		String str2 = scanner.nextLine();

		TestMain7 t = new TestMain7();
		t.stringCompare(str1, str2);

	}

}
