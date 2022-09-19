package com.yash.exception.task8;

import java.util.Scanner;
import java.util.*;
import com.yash.exception.custom.PasswordFormatException;

/**
 * User will input the password and with the help of your algorithm. You are
 * suppose to test that password is strong or not. A password is said to be
 * strong if it is of length in the range of 8 to 14 and having at least 2
 * capital letters, 2 small letters, 2 digits and 2 special characters. This is
 * minimum requirements for password of length 8 for password of length greater
 * than 8 this should be present and other character can be used. If user not
 * entered the password in given format PasswordFormatException should be thrown
 * and handled properly.
 * 
 * @author ankesh.patil
 *
 */
public class TestMain8 {
	
	
	public static void printPassowrdStrength(String input) throws PasswordFormatException {
		
		int lowercount = 1;
		int uppercount = 1;
		int digitcount = 1;
		int specialCharcount = 1;
		int n = input.length();
		
		boolean hasLower = false, hasUpper = false, hasDigit = false, specialChar = false;

		Set<Character> set = new HashSet<Character>(Arrays.asList('!', '@', '#', '$', '%', '^', '&', '*', '-', '+'));

		for (char i : input.toCharArray()) {

			if (Character.isLowerCase(i)) {
				hasLower = true;
				lowercount++;
			}
			if (Character.isUpperCase(i)) {
				hasUpper = true;
				uppercount++;
			}
			if (Character.isDigit(i)) {
				hasDigit = true;
				digitcount++;
			}
			if (set.contains(i)) {
				specialChar = true;
				specialCharcount++;
			}
		}

		if ((lowercount > 2) && (uppercount > 2) && (digitcount > 2) && (specialCharcount > 2) && (n > 8))
			System.out.print("Welcome you have entered correct password");

		else
			throw new PasswordFormatException("Password Format Exception");
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the passoword");
		String input = scanner.nextLine();
		try {
			printPassowrdStrength(input);
		} catch (PasswordFormatException e) {

			e.printStackTrace();
		}
	}

}
