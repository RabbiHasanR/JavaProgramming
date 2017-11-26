package com.oop.exercise;

public class Employe {
	private int id;
	private String firstName;
	private String lastName;
	private double salary;

	Employe(int id, String firstName, String lastName, double salary) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getName() {
		return firstName + lastName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getAnualSalary() {
		return salary * 12;
	}

	public double increaseSalary(int parcent) {
		double increaseSalary = ((salary * parcent) / 100);
		double newSalary = salary + increaseSalary;
		return newSalary;
	}

	public String toString() {
		return "Employe[Name=" + firstName + " " + lastName + "Salary=" + salary + "]";
	}

}
