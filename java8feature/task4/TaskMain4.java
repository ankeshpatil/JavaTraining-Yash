package com.yash.java8feature.task4;

/**
 * 
 * @author ankesh.patil
 *
 */
/*
 * WAP to insert one string into another string. Also perform garbage collection
 * when insertion is done
 */

/*
 */
import java.util.Scanner;

interface Print {
	String print(String originalString, String stringToBeInserted, int index);
}

public class TaskMain4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter original");
		String originalString = sc.next();
		System.out.println("Enter which u want to insert");
		String wantToInsert = sc.next();
		System.out.println("Enter index where u want to insert");
		int index = sc.nextInt();

		Print word = (s1, s2, in) -> {
			String newString = new String();
			for (int i = 0; i < s1.length(); i++) {
				newString += s1.charAt(i);
				if (i == in) {
					newString += s2;
				}
			}
			return newString;

		};
		System.out.println("Result: " + word.print(originalString, wantToInsert, index));

	}

	

}
