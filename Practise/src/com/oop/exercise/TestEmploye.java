package com.oop.exercise;

import java.util.Scanner;

public class TestEmploye {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employe e = new Employe(1, "Rabbi", "Hasan", 100000);
		System.out.println(e.toString() + "/" + "AnualSalary=" + e.getAnualSalary());
		System.out.println("Increase Salary=" + e.increaseSalary(50));
		Scanner s = new Scanner(System.in);
		String st = s.nextLine();
		String sf = "HackerRank";
		System.out.println(sf + st);
	}

}
