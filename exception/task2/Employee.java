package com.yash.exception.task2;
/**
 * author:ankesh.patil
 */
import java.util.Scanner;

import com.yash.exception.custom.EmployeeAbscondingException;
import com.yash.exception.custom.LeaveExceedLimitException;

public class Employee {
	char[] presentDay;
	int salary;

	public Employee(char[] presentDay, int salary) {
		this.presentDay = presentDay;
		this.salary = salary;
	}

	public static void main(String[] args) {
		char[] arr = { 'L', 'L', 'L', 'P', 'P', 'P', 'P', 'P', 'P', 'P', 'P', 'P', 'P', 'P', 'P', 'P', 'P', 'P', 'P',
				'P', 'P', 'P', 'P', 'P', 'P', 'P', 'N', 'N', 'N', 'L' };
		int leave = 0;// tracker for counting the number of leaves
		int countNonInfoTrack = 0;// tracker for continuous leaves
		int countMaxNonInfo = 0;// holding the max of continuous leaves
		int present = 0;
		int sal = 30000;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 'L')
				leave++;
			if (arr[i] == 'P')
				present++;
			if (arr[i] == 'N') {
				countNonInfoTrack++;
				if (countMaxNonInfo < countNonInfoTrack) {
					countMaxNonInfo = countNonInfoTrack;
				}
			} else
				countNonInfoTrack = 0;

		}
		if (countMaxNonInfo >= 4) {
			try {
				throw new EmployeeAbscondingException("Fired");
			} catch (EmployeeAbscondingException eae) {
				System.out.print("fired");
			}
		} else {
			int empSal = (sal / 30) * present;
			System.out.println(empSal);
			if (leave > 2) {
				try {
					throw new LeaveExceedLimitException("Leave Exceded");
				} catch (LeaveExceedLimitException lee) {
					System.out.println("Leave exceded");
				}
			}

		}

	}
}