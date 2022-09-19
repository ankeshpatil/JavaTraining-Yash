package com.yash.exception.task5;

import java.util.Scanner;

/**
 * 
 * @author ankesh.patil
 *
 */
/*
 * A user try to book the ticket in the railway system. A user can only book 6
 * ticket at a time in case of normal booking and 4 ticket at the time of tatkal
 * booking. Tatkal booking is only allowed to be done in between 10 to 12. When
 * he choose to book ticket in tatkal he is only allowed to book 4 tickets. You
 * are suppose to perform following task during 10 to 12 only tatkal tickets can
 * be booked it means only four ticket can be booked for tatkal if user try to
 * book the more than 4 ticket in tatkal you have to throw the exception booking
 * limit exceed. During 11:00 PM to 1:00 AM user is not allowed to book any
 * ticket if he try to book the ticket during this duration
 * BookingNotAllowedException should be thrown. User can book normal ticket
 * whole day except the time duration 11:00 PM to 1:00 AM. If user try to book
 * more than 6 tickets. NormalTicketBookingException should be thrown. Ticket
 * for age limit 0 year to 5 is not allowed if user try to book the ticket for
 * the same age group Exception should be thrown.
 */
public class TestMain5 {
	
	public static void main(String[] args) {
		try {
			System.out.println("Welcome to Rail Recservation System");
			System.out.println();
			System.out.println("*******************************************************************");
			System.out.println();
			System.out.println("Enter the Tatkal/Normal Class Type");

			Scanner scanner = new Scanner(System.in);

			String booking = scanner.next();

			if (booking.equalsIgnoreCase("Tatkal") || booking.equalsIgnoreCase("Normal")) {

				if (booking.length() > 1) {

					NormalTicketBooking.getNormalTicket(booking);
					TatkalBooking.getTatkalTicket(booking);

					System.out.println();

					scanner.close();

				}

			} else {
				System.out.println("You have entered wrong Option");
				System.out.println();
				main(args);

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
