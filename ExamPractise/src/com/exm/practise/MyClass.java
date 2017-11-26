package com.exm.practise;

import java.util.Scanner;

public class MyClass {
	public boolean a = false;
	public int b;

	public void display() {
		Scanner input = new Scanner(System.in);
		if (a) {
			System.out.println("Rabbi");

		} else {
			System.out.println("Riaz");
		}
		while (b < 999) {
			b = input.nextInt();
		}
	}

}
