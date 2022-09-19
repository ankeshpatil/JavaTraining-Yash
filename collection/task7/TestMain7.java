package com.yash.collection.task7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.stream.Collectors;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

/**
 * 
 * @author ankesh.patil
 *
 */
/*
 * WAP to store the student class objects in List. Student class structure :-
 * Student{ int rollno; String sname, classname; String totalmarks; // marks out
 * of 500, total five subjects each subject marks 100. } On the basis of the
 * detail entered by the user. Now you have to perform the following operations.
 * a) Print the name of students who secure first, second and third position. b)
 * Print name of those students who’s marks are below 50%. c) Print name of
 * those students who’s marks are below 35% it means they are fail. d) Print
 * name of those students who’s marks are above average score. //e) Print detail
 * of all students on the basis of Name
 */
public class TestMain7 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		List<Student> studentList = Arrays.asList(
				new Student(101, "someshwar", 45), new Student(102, "mahesh", 40),
				new Student(103, "anurag", 70), new Student(104, "nikhil", 75));
		List<Double> collect2 = studentList
				.stream()
				.map(Student::getAvg)
				.collect(Collectors.toList());
		List<Double> firstThreeNumbers = collect2
				.stream()
				.sorted()
				.collect(Collectors.toList());
		firstThreeNumbers.forEach(System.out::println);
		List<Student> nameBelowFiftyMarks = studentList
				.stream()
				.filter(s -> s.getAvg() < 50)
				.collect(Collectors.toList());
		nameBelowFiftyMarks.forEach(System.out::println);
		List<Student> nameBelowThirtyfive = studentList
				.stream()
				.filter(s -> s.getAvg() < 35)
				.collect(Collectors.toList());
		nameBelowThirtyfive.forEach(System.out::println);
		List<String> byName = studentList
				.stream()
				.map(Student::getSname)
				.collect(Collectors.toList());
		byName.forEach(System.out::println);
	}

}
