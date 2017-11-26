package com.piash.solve;

public class Customer {
	public String customerId;
	public String name;
	public String email;
	public String address;
	public String choice;

	Customer(String customerId, String name, String email, String address, String choice) {
		this.customerId = customerId;
		this.name = name;
		this.email = email;
		this.address = address;
		this.choice = choice;
	}

	public void rentRoom(StandardRoom sr, FamillyRoom fr, Suite s) {
		if (choice.equalsIgnoreCase("standard")) {
			System.out.println("This is Standard Room");
			System.out.println("Customer Id is " + customerId);
			System.out.println("Customer name is " + name);
			System.out.println("Customer address is " + address);
			System.out.println("Customer email is " + email);
			sr.display();
		} else if (choice.equalsIgnoreCase("Family")) {
			System.out.println("This is Family Room");
			System.out.println("Customer Id is " + customerId);
			System.out.println("Customer name is " + name);
			System.out.println("Customer address is " + address);
			System.out.println("Customer email is " + email);
			fr.display();
		} else if (choice.equalsIgnoreCase("Suite")) {
			System.out.println("This is Suite");
			System.out.println("Customer Id is " + customerId);
			System.out.println("Customer name is " + name);
			System.out.println("Customer address is " + address);
			System.out.println("Customer email is " + email);
			s.display();
		} else {
			System.out.print("Customer does not rent room");
		}
	}

}
