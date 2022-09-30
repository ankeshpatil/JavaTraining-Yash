package com.yash.java8feature.task2;

/**
 * @author ankesh.patil
 */
/*
 * WAP to check the given sequence of character in given string. Suppose 
that you are given following string “Taj is situated in Agra.” And you 
have to find following sequence AST. AST should be one after another. If 
you found sta, or tas, or tsa it should print string not found.
 */
import java.util.Arrays;	
import java.util.List;
import java.util.stream.Collectors;

public class TestMain2 {
	public static void main(String[] args) {
		String str = "Taj is ast situated ast in Agra";

		List<String> list = Arrays.asList(str.split(" "));

		Object[] a = list.toArray();

		List<String> list2 = list.stream().filter(i -> i.contains("ast")).collect(Collectors.toList());

		System.out.println(list2);
	}
}
