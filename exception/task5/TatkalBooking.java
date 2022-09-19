package com.yash.exception.task5;

import java.util.Date;
import java.util.Scanner;

import com.yash.exception.custom.TatkalTicketBookingException;

public class TatkalBooking {
	public static void getTatkalTicket(String input) {
		int max = 72;
		int min = 5;
		Date d = new Date();

		if (input.equalsIgnoreCase("Tatkal")) {

			int time = d.getHours();
			try {
				if (time >= 10 && time <= 12) {

					String name1 = "";
					String name2 = "";
					String name3 = "";
					String name4 = "";

					System.out.println();
					System.out.println("Enter the Number of tickets you want to book");

					System.out.println();

					Scanner scanner = new Scanner(System.in);

					int number = scanner.nextInt();

					try {
						if (number > 4) {

							throw new TatkalTicketBookingException("More than 4 tickets cant be done at a time");
						}
					} catch (Exception e) {
						System.out.println(e);
					}

					if (number < max && number < 5) {

						Scanner sc = new Scanner(System.in);

						System.out.println("Please name of First Passengers");

						name1 = sc.nextLine();

						if (number > 1) {

							System.out.println("Please name of Second Passengers");

							name2 = sc.nextLine();
						}
						if (number > 2) {
							System.out.println("Please name of Third Passengers");

							name3 = sc.nextLine();
						}
						if (number > 3) {
							System.out.println("Please name of Fourth Passengers");

							name4 = sc.nextLine();
						}
						int b = (int) (Math.random() * (max - min + 1) + min);

						System.out.println();

						System.out.println("Congratulations you have Booked Tickets for " + name1
								+ " and seat number is B1-" + (b - 4));

						if (number > 1) {
							System.out.println("Congratulations you have Booked Tickets for " + name2
									+ " and seat number is B1-" + (b - 3));
						}
						if (number > 2) {
							System.out.println("Congratulations you have Booked Tickets for " + name3
									+ " and seat number is B1-" + (b - 2));
						}

						if (number > 3) {
							System.out.println("Congratulations you have Booked Tickets for " + name4
									+ " and seat numberc is B1-" + (b - 1));
						}

						Date timenow = new Date();
						System.out.println();
						System.out.println("Date: " + timenow.toString());

						System.out.println("Your Booking Successful!!!");

						System.out.println("Please be polite,keep your place clean . Have a safe journey.");
						System.out.println("Support made in India!!!");
						System.out.println("!!Have a great day!!!");
						System.out.println();

					}
				} else {
					throw new TatkalTicketBookingException("Out of taktal booking time");
				}
			}

			catch (Exception e) {
				System.out.println(e);

			}

		}
	}
}
