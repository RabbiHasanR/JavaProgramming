package com.loop.practise;

import java.util.Scanner;

public class SentinalValue {
	public int sum = 0;
	Scanner input = new Scanner(System.in);

	public void sentinal() {
		System.out.println("Enter number(the program exits if input 0).");
		int data = input.nextInt();
		while (data != 0) {
			sum += data;
			System.out.println("Enter number(the program exits if input 0).");
			data = input.nextInt();
		}
		System.out.println("The sum is: " + sum);
	}

}
