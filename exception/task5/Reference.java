package com.yash.exception.task5;

import java.time.LocalTime;
/**
 * 
 * @author ankesh.patil
 *
 */

public class Reference {
	
	public static void main(String[] args) {
		// create a LocalTime object

		LocalTime time = LocalTime.now();

		// get Hour field using getHour()
		int Hour = time.getHour();

		// print result
		System.out.println("Hour Field: " + Hour);
	}
}
