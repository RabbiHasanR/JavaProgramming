package com.puspo.solve;

import java.util.Scanner;

public class ReservationSystem {
	public int choice;
	public int needSeat;
	public int firstClassSeat = 0;
	public int economyClassSeat = 0;
	public int totalSeat = 0;
	public int decission;

	public void ticketBooking() {
		Scanner input = new Scanner(System.in);
		do {
			if (firstClassSeat < 5 || economyClassSeat < 5) {
				do {

					System.out.println("Choice your ticket.1.first class and 2.Economy class");
					switch (choice = input.nextInt()) {
					case 1:
						if (firstClassSeat >= 5) {
							System.out.println("Not Available seat");
						} else {
							System.out.print("How many seat need?");
							needSeat = input.nextInt();
							firstClassSeat += needSeat;
							// totalSeat+=firstClassSeat;
							System.out.println("First Class Seat booking successfully");
						}

						break;
					case 2:
						if (economyClassSeat >= 5) {
							System.out.println("Not Avalilable seat");
						} else {
							System.out.print("How many seat need?");
							needSeat = input.nextInt();
							economyClassSeat += needSeat;
							// totalSeat++;
							System.out.println("Economy Class Seat booking Succesfully");
						}
						break;
					/*
					 * case 3: System.out.print(
					 * "Not Need seat Booking.Thank you"); break;
					 */
					default:
						System.out.println("Invalid Choice.Please try again");
						break;
					}

				} while (choice != 1 && choice != 2);
				do {
					System.out.println("Do you want to more seat?1.Yes and 2.No");
					decission = input.nextInt();
					if (decission != 1 && decission != 2) {
						System.out.println("Invalid Choice.Try Again");
					}
				} while (decission != 1 && decission != 2);
			} else {
				System.out.println("All Seat books.next flit leavs in 3 hours");
				break;
			}

		} while (decission == 1);
		System.out.println("Thanks for seat booking");
	}

}
