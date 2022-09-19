package com.yash.exception.task6;

import java.util.Scanner;

/**
 * 
 * @author ankesh.patil
 *
 */
/*
 * A Customer is going to buy an Assembled System. System can be assembled with
 * the following criteria. I3,I5, and I7 should have minimum of 4 GB RAM and 250
 * GB SDD. With dual core, quad core and core to dual processor minimum of 1 GB
 * RAM and 160 GB HDD are sufficient below to that is not allowed. Now your task
 * is to help the customer to buy the system on the basis of his requirements.
 * If customer buy the I3, I5 and I7 system with lower RAM than the recommended
 * RAM LowerRAMSizeException should be thrown. If he try to buy HDD with I
 * series processor MisMatchHardDiskException should be thrown. If customer buy
 * lower RAM in dual core, core to dual and quad core processor
 * LowerRAMException should be thrown. If customer want to put SSD with dual
 * core , quad core or core to dual processor, HardDiskNotSupportedException
 * Should be thrown. HDD is also not supported with I series processor,
 * HardDiskNotSupportedException should be thrown and handled.
 */
public class TestMain6 {
	public static void main(String[] args) {
		String sORh = "";
		Scanner sc = new Scanner(System.in);

		System.out.println("select Assembled system");
		System.out.println("Press 1 for I3");
		System.out.println("Press 2 for I4");
		System.out.println("Press 3 for I5");
		System.out.println("Press 4 for dual core");
		System.out.println("Press 5 for quad core");
		System.out.println("Press 6 for core to dual processor ");
		int input = sc.nextInt();
		System.out.println("Enter RAM in GB");
		int ram = sc.nextInt();
		int shdvalue = 0;

		try {
			if (input == 1 || input == 2 || input == 3) {
				if (ram < 4) {
					System.out.println("exception LowerRAMSizeException ");
					throw new Exception("LowerRAMSizeException ");

				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

		try {
			if (input == 1 || input == 2 || input == 3) {
				if (ram < 4) {
					System.out.println("exception LowerRAMSizeException ");
					throw new Exception("LowerRAMSizeException ");

				} else {
					System.out.println("Enter hdd to buy HDD and sdd to buy SDD");
				}

			}

			sORh = sc.next();

			if ((input == 1 || input == 2 || input == 3) && sORh.equals("hdd")) {

				System.out.println("exception MisMatchHardDiskException  ");
				System.out.println(" HDD is not supported with I series processor - HardDiskNotSupportedException ");
				throw new Exception("MisMatchHardDiskException");

			} else {
				System.out.println(" enter " + sORh + " value");
				shdvalue = sc.nextInt();
			}

			if (input == 1 || input == 2 || input == 3) {
				if (shdvalue < 250) {
					System.out.println("value below 250 is not allowed");
					throw new Exception("LowerRAMSizeException ");

				} else {
					System.out.println("Your system is ready for Assembled ");
				}
			}

		}

		catch (Exception e) {
			System.out.println(e);
		}

		// for quad

		try {
			if (input == 4 || input == 5 || input == 6) {
				if (ram < 1) {
					System.out.println("exception LowerRAMSizeException ");
					throw new Exception("LowerRAMSizeException ");

				} else {
					System.out.println("Enter hdd to buy HDD and sdd to buy SDD");
					sORh = sc.next();
				}

			}

			if ((input == 3 || input == 4 || input == 5) && sORh.equals("sdd")) {

				System.out.println("exception MisMatchHardDiskException  ");
				System.out.println(" SDD is not supported with I series processor - HardDiskNotSupportedException ");
				throw new Exception("MisMatchHardDiskException");

			} else {
				System.out.println(" enter" + sORh + " value");
				shdvalue = sc.nextInt();
			}

			if (input == 3 || input == 4 || input == 5) {
				if (shdvalue < 160) {
					System.out.println("value below 160 GB is not allowed");
					throw new Exception("LowerRAMSizeException ");

				} else {
					System.out.println("Your system is ready for Assembled ");
				}
			}

		}

		catch (Exception e) {
			System.out.println(e);
		}

	}

}
