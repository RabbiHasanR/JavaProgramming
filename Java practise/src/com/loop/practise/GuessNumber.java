package com.loop.practise;

import java.util.Scanner;

public class GuessNumber {
	public int number;

	public void displayGuess() {
		number = (int) (Math.random() * 101);
		// System.out.println(number);
		Scanner input = new Scanner(System.in);
		int guess = -1;
		while (guess != number) {
			System.out.println("Enter guess number:");
			guess = input.nextInt();
			if (guess == number) {
				System.out.println("This is number");
			} else if (guess > number) {
				System.out.println("High Number");
			} else
				System.out.println("Low Number");
		}

	}

}
