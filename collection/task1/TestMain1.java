/**
 * WAP to sort Collection elements in ascending order.
 */
package com.yash.collection.task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

import com.yash.collection.task7.Student;

/**
 * @author ankesh.patil
 *
 */
public class TestMain1 {
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		List<Student> studentList = Arrays.asList(new Student(101, "someshwar", 45), new Student(102, "mahesh", 40),
				new Student(103, "anurag", 70), new Student(104, "nikhil", 75));
		List<Double> collect2 = studentList.stream().map(Student::getAvg).collect(Collectors.toList());
		List<Double> firstThreeNumbers = collect2.stream().sorted().collect(Collectors.toList());
		firstThreeNumbers.forEach(System.out::println);
		List<Student> nameBelowFiftyMarks = studentList.stream().filter(s -> s.getAvg() < 50)
				.collect(Collectors.toList());
		nameBelowFiftyMarks.forEach(System.out::println);
		List<Student> nameBelowThirtyfive = studentList.stream().filter(s -> s.getAvg() < 35)
				.collect(Collectors.toList());
		nameBelowThirtyfive.forEach(System.out::println);
		List<String> byName = studentList.stream().map(Student::getSname).collect(Collectors.toList());
		byName.forEach(System.out::println);
	}

}
