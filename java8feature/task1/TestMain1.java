package com.yash.java8feature.task1;

/**
 * author: ankesh.patil
 */
/*
 * WAP to check the given no is palindrome or not. Don’t use divide 
method.
 */
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class TestMain1 {
	static Logger logger = Logger.getLogger(TestMain1.class.getName());

	public static void main(String[] args) {
		BasicConfigurator.configure();
		StringBuilder bl = new StringBuilder();
		String word;
		logger.info("enter word to check given word is palindrome or not=");
		Scanner sc = new Scanner(System.in);
		word = sc.next();
		

		boolean isPallindrome = IntStream.range(0, word.length() / 2)
				.allMatch(i -> word.charAt(i) == word.charAt(word.length() - i - 1));
		if (isPallindrome) {
			logger.info("Palindrome");
		} else {
			logger.info("Not Palindrome");
		}

	}

}
